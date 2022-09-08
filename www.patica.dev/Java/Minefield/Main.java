package Minefield;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int row = inp.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int column = inp.nextInt();
        MineSweeper game = new MineSweeper(row, column);

        game.run();
        
    }
}
