package TemelKavramlar;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        double Tutar;
        System.out.println("Tutarı giriniz:");
        Tutar = Input.nextDouble();

        boolean KDV = (0<Tutar) && (Tutar>1000);

        Tutar=(KDV ? Tutar+(Tutar*0.08): Tutar+(Tutar*0.18));
        System.out.println("KDV'li tutarınız: "+Tutar);
        
    }
    
}
