package TemelKavramlar;
import java.util.Scanner;;

public class Manav {
    public static void main(String[] args) {
        double Armut=2.14, Elma=3.67, Domates=1.11,Muz=0.95,Patlican=5,Kilo,Tutar=0;
        Scanner Input =new Scanner(System.in);
        System.out.println("Armut kaç kilo:");
        Kilo=Input.nextDouble();
        Tutar += Armut*Kilo;

        System.out.println("Elma kaç kilo:");
        Kilo=Input.nextDouble();
        Tutar += Elma*Kilo;

        System.out.println("Domates kaç kilo:");
        Kilo=Input.nextDouble();
        Tutar += Domates*Kilo;

        System.out.println("Muz kaç kilo:");
        Kilo=Input.nextDouble();
        Tutar += Muz*Kilo;

        System.out.println("Patlıcan kaç kilo:");
        Kilo=Input.nextDouble();
        Tutar += Patlican*Kilo;

        Input.close();

        System.out.println("Toplam tutar: "+Tutar+" TL");
        
    }
    
}
