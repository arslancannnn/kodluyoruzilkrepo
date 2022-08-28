package Donguler;
import java.util.Scanner;;

public class MukemmelSayi {
    public static void main(String[] args) {
        
            Scanner inp =new Scanner(System.in);
            int sayi, toplam=0;

            System.out.println("Bir sayı girin: ");
            sayi=inp.nextInt();

            for (int i = 1; i < sayi; i++) {
                if(sayi % i ==0){
                    toplam +=i;
                }
            }
            if(toplam==sayi)
                System.out.println(sayi+" Mükemmel sayıdır");
            else
                System.out.println(sayi+" Mükemmel sayı değildir");
            
    }
}
