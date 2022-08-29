package Metotlar;
import java.util.Scanner;;

public class Us {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı girin:");
        int num = inp.nextInt();

        System.out.println("Üssü girin: ");
        int us = inp.nextInt();

        inp.close();
        System.out.println(power(num, us));
    }

    static int power(int num, int us){

        if(us==1)
            return num;
        return num*power(num, us-1);
    }
}
