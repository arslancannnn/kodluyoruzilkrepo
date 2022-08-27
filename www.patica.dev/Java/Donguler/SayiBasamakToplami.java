package Donguler;
import java.util.Scanner;;

public class SayiBasamakToplami {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int num,BasamakToplam=0;

            System.out.println("Bir sayı girin: ");
            num=inp.nextInt();

            while(num != 0){
                BasamakToplam += num%10;
                System.out.print(num%10);
                if(num/10 !=0)
                    System.out.print("+");
                num= num/10;
                

            }
            System.out.println(" = "+BasamakToplam);
        }
    }
    
}
