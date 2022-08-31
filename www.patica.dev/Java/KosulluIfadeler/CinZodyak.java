package KosulluIfadeler;
import java.util.Scanner;;

public class CinZodyak {
    public static void main(String[] args) {
        int dogum,burc;
        Scanner inp =new Scanner(System.in);
        
        System.out.println("Doğum yılınızı girin: ");
        dogum=inp.nextInt();
        inp.close();

        burc=dogum%12;

        switch (burc) {
            case 0 -> System.out.println("Çin zodyağı burcunuz: Maymun");
            case 1 -> System.out.println("Çin zodyağı burcunuz: Horoz");
            case 2 -> System.out.println("Çin zodyağı burcunuz: Köpek");
            case 3 -> System.out.println("Çin zodyağı burcunuz: Domuz");
            case 4 -> System.out.println("Çin zodyağı burcunuz: Fare");
            case 5 -> System.out.println("Çin zodyağı burcunuz: Öküz");
            case 6 -> System.out.println("Çin zodyağı burcunuz: Kaplan");
            case 7 -> System.out.println("Çin zodyağı burcunuz: Tavşan");
            case 8 -> System.out.println("Çin zodyağı burcunuz: Ejderha");
            case 9 -> System.out.println("Çin zodyağı burcunuz: Yılan");
            case 10 -> System.out.println("Çin zodyağı burcunuz: At");
            case 11 -> System.out.println("Çin zodyağı burcunuz: Koyun");    
        }
    }
}
