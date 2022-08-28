package Donguler;
import java.util.Scanner;;

public class Elmas {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {  
            int num;
          
            System.out.println("Bir sayı girin: ");
            num=inp.nextInt();

             for (int i = 0; i <= num; i++) {
                for (int j = 0; j < (num-i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = num-1; i >= 0; i--) {
                for (int j = 0; j < (num-i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        
       
    }
}
