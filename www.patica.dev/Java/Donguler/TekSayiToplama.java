package Donguler;
import java.util.Scanner;;

public class TekSayiToplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int girilenSayi,toplam=0;
        do {
            System.out.print("\nBir sayı girin: ");
            girilenSayi=inp.nextInt();

            if(girilenSayi%4==0)
                toplam += girilenSayi;
                
        } while (girilenSayi%2==0);
        
        System.out.println("Toplam: "+toplam);
    }
    
}
