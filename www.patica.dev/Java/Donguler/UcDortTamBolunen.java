package Donguler;
import java.util.Scanner;;

public class UcDortTamBolunen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int deger,tamBolunenSayisi=0;
        double Avg=0;

        System.out.println("Sayı giriniz: ");
        deger=inp.nextInt();

        for(int i=1;i<=deger;i++){
            if(i%3==0 && i%4==0){
                Avg += i;
                tamBolunenSayisi += 1;
            }
        }
        Avg=Avg/tamBolunenSayisi;
        System.out.println("Ortalama: "+Avg);
        
    }
    
}
