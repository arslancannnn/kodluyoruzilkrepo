package KosulluIfadeler;
import java.util.Scanner;;

public class UcakBiletiHesap {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double tarife =0.10,ucret=0;
        Scanner inp =new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi km cinsinden yazınız: ");
        mesafe=inp.nextInt();

        System.out.println("Yaşınızı girin: ");
        yas=inp.nextInt();

        System.out.println("Yolculuk tipini seçin: \n1- Tek yön\n2-Gidiş dönüş");
        yolculukTipi=inp.nextInt();

        if(mesafe<0 || yas<0 || (yolculukTipi<1 && yolculukTipi>2))
            System.out.println("Hatalı Veri Girdiniz !");
        else{
            ucret=mesafe*tarife;

            if(yas<12)
                ucret=ucret*0.50;
            else if(yas>=12 && yas<= 24)
                ucret=ucret*0.90;
            else if(yas>65)
                ucret=ucret*0.70;
            
            if(yolculukTipi==2)
                ucret=ucret*0.80*2;
            
            System.out.println("Toplam tutar: "+ucret+"TL");
        }

    }
    
}
