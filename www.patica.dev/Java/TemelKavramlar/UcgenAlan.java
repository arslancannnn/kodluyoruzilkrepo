package TemelKavramlar;
import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        double Kenar1, Kenar2, Kenar3, Alan;

        Scanner Input = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz:");
        Kenar1 = Input.nextDouble();
        System.out.print("/nİkinci kenarı giriniz:");
        Kenar2 = Input.nextDouble();
        System.out.print("/nÜçüncü kenarı giriniz:");
        Kenar3 = Input.nextDouble();
        Input.close();

        
        Alan = (Kenar1+Kenar2+Kenar3)/2;
        
        Alan = Math.sqrt(Alan*(Alan-Kenar1)*(Alan-Kenar2)*(Alan-Kenar3));
        System.out.print("/nÜçgenin alanı: "+ Alan);


    }
    
}
