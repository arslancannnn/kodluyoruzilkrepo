package Minefield;

import java.util.Scanner;

public class MineSweeper {
    int column;
    int row;
    String[][] board; 
    String[][] map;
    int mine;
    int correctChoice;
    int selectedRow;
    int selectedColumn;
    int nearbyMine;
    int winCondition;


    MineSweeper(int row, int column){

        this.column        = column;
        this.row           = row;
        this.mine          = (column*row)/4;
        this.correctChoice = 0;
        this.winCondition   = (column*row-mine);    
        board              = new String[row][column];
        map                = new String[row][column];

    }

    //oyuncu haritası oluşturma
    public void createBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]= "-";
            }
        }
    }
    //oyun haritası oluşturma
    public void createMap(){
        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                this.map[i][j]= "-";
            }
        }

        
        while (mine>0) {
            int randColumn = (int) (Math.random()*this.column);
            int randRow    = (int) (Math.random()*this.row);          
           
            if( this.map[randRow][randColumn] != "*" ){
                this.map[randRow][randColumn] = "*";
                mine--;
            }else{
                continue;
            }
           
        }
        
    }
    //oyun 
    public void play(){
        if(isWin()){
            System.out.println("=======================");
            System.out.println("You Win!!");
            System.out.println("=======================");
        }else{
            System.out.println("______________________");
            printBoard();
            Scanner inp = new Scanner(System.in);
            System.out.print( "Bir satır seçin: ");
            this.selectedRow = inp.nextInt()-1;
            System.out.print("Bir sütun seçin: ");
            this.selectedColumn = inp.nextInt()-1;
            

            if(this.selectedRow < 0 || this.selectedRow > this.row-1 || this.selectedColumn < 0 || this.selectedColumn > this.column-1){
                System.out.println("Lütfen belirtilen aralıkta seçim yapın");
                play();
            }else{
               
                if(this.board[selectedRow][this.selectedColumn] != "-" ){
                    System.out.println("Bu noktayı daha önce seçtiniz lütfen başka bir konum seçin");
                    play();
                }else{
                    check();
                }
            }


        }
    }

    //çevredeki mayınları kontrol etme
    private void check() {

        this.nearbyMine=0;
        if(this.map[this.selectedRow][this.selectedColumn] == "*"){
            System.out.println("Game Over!!");
            printMap();
        }else{
            if(this.selectedRow == 0 && this.selectedColumn == 0){
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                    
                }
            }else if(this.selectedRow == 0 && this.selectedColumn < this.column-1){
                for (int i = 0; i < 2; i++) {
                    for (int j = this.selectedColumn-1; j <= this.selectedColumn+1; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                        
                    }
                }

            }else if(this.selectedRow == 0 && this.selectedColumn == this.column-1){
                for (int i = 0; i < 2; i++) {
                    for (int j = this.selectedColumn-1; j < this.selectedColumn+1; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }

            }else if(this.selectedRow == this.row-1 && this.selectedColumn ==0){
                for (int i = this.selectedRow-1; i < this.selectedRow+1; i++) {
                    for (int j = 0; j < 2; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }

            }else if(this.selectedRow < this.row-1 && this.selectedColumn == 0){
                for (int i = this.selectedRow-1; i <= this.selectedRow+1; i++) {
                    for (int j = 0; j < 2; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }
            }else if(this.selectedRow == this.row-1 && this.selectedColumn == this.column-1){
                for (int i = this.selectedRow-1; i < this.selectedRow+1; i++) {
                    for (int j = this.selectedColumn-1; j < this.selectedColumn+1; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }
            }else if(this.selectedRow < this.row-1 && this.selectedColumn == this.column-1){
                for (int i = this.selectedRow-1; i <= this.selectedRow+1; i++) {
                    for (int j = this.selectedColumn-1; j < this.selectedColumn+1; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }

            }else if(this.selectedRow == this.row-1 && this.selectedColumn < this.column-1){
                for (int i = this.selectedRow-1; i < this.selectedRow+1; i++) {
                    for (int j = this.selectedColumn-1; j <= this.selectedColumn+1; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }

            }else{
                for (int i = this.selectedRow-1; i <= this.selectedRow+1; i++) {
                    for (int j = this.selectedColumn-1; j <= this.selectedColumn+1; j++) {
                        if(this.map[i][j] == "*"){
                            this.nearbyMine +=1;
                        }
                    }
                }
            }
            this.board[selectedRow][selectedColumn] = String.valueOf(nearbyMine);
            this.correctChoice +=1;
            play();
        }
            
    }
       
    
  //kazanma kontrolü
    public boolean isWin(){
        if(this.correctChoice == this.winCondition){
            return true;
        }
        return false;
    }

    //oyuncu haritasını yazdırma
    public void printBoard(){

        for (String[] row : this.board) {
            for (String col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    //oyun haritasını yazdırma
    public void printMap(){

        for (String[] row : this.map) {
            for (String col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    //oyunu başlatma
    public void run() {
        createBoard();
        createMap();
        play();
    }
}
