package Donguler;
import java.util.Scanner;;

public class HarmonikSeri {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int num;
            double result=0;
            System.out.println("Bir sayı girin: ");
            num= inp.nextInt();

            for (int i = 1; i <= num; i++) {
                result += (1.0/i);
            }
            System.out.print("Harmonik seri = "+result);
        }
    }
}
