package Diziler;
import java.util.Scanner;;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        

        
        System.out.println("Girilecek satır sayısı: ");
        int r = inp.nextInt();
        System.out.println("Girilecek sütun sayısı: ");
        int c = inp.nextInt();

        int[][] arr = new int[r][c];
        int[][] arrTranspoze = new int[c][r];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(i+". satır "+j+". sutun: ");
                arr[i][j] = inp.nextInt();
            }
        }
        inp.close();

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrTranspoze[j][i] = arr[i][j];
            }
        }
        for (int[] row : arrTranspoze) {
            for (int col : row) {
                System.out.print(col+", ");
            }
            System.out.println();
        }
    }
}
