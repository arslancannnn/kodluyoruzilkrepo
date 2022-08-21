package TemelKavramlar;
import java.util.Scanner;;

public class VucutKitleIndex {
    public static void main(String[] args) {
        double Boy,Kilo,Index;
        Scanner Input =new Scanner(System.in);

        System.out.println("Lütfen boyunuzu(metre cinsinden) giriniz:");
        Boy=Input.nextDouble();
        System.out.println("Lütfen kilonuzu girin");
        Kilo=Input.nextDouble();
        Index=Kilo/(Boy*Boy);
        System.out.println("Vücut kitle indeksiniz: "+Index);

    }
    
}
