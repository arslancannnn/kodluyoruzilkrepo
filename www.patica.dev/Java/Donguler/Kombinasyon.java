package Donguler;
import java.util.Scanner;;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1,num2,num1Fak=1,num2Fak=1,kombinasyon,farkFak=1;

        System.out.println("1. sayıyı girin: ");
        num1=inp.nextInt();

        System.out.println("2. sayıyı girin: ");
        num2=inp.nextInt();

        for (int i = 1; i <= num1; i++) {
            num1Fak *= i;
        }
        for (int i = 1; i <= num2; i++) {
            num2Fak *= i;
        }
        for (int i = 1; i <= (num1-num2); i++) {
            farkFak *= i;
        }
        kombinasyon = num1Fak/(num2Fak*farkFak);
        System.out.println("C("+num1+","+num2+")= "+kombinasyon);
    }
}
