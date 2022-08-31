package Donguler;
import java.util.Scanner;;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int taban,us;
        long sonuc=1;

        System.out.print("Üssü alınacak sayı: ");
        taban=inp.nextInt();

        System.out.print("\nÜs olacak sayı: ");
        us=inp.nextInt();

        inp.close();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("\n"+taban+"^"+us+" = "+sonuc);
    }
}
