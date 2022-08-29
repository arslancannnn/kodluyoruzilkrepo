package Metotlar;
import java.util.Scanner;;

public class PolindromSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Bir sayı girin: ");
        int num= inp.nextInt();
        boolean result = isPolindrom(num);

        if(result)
            System.out.println("Sayı polindrom");
        else
            System.out.println("Sayı polindrom değil");
    }

    static boolean isPolindrom (int num){

        int temp=num;
        int last,reverse = 0;

        while (temp != 0) {
            last= temp % 10;
            reverse = (reverse*10)+last;
            temp /= 10;
        }
        if(reverse==num)
            return true;
        else
            return false;
    }
}
