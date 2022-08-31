package Donguler;
import java.util.Scanner;;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num;
        int bir=0,iki=1,d;

        System.out.println("Bir sayı girin: ");
        num=inp.nextInt();
        inp.close();
        
        System.out.print(bir+" "+iki+" ");
        for (int i = 1; i <= num; i++) {
            d=bir+iki;
            System.out.print(d+" ");
            bir=iki;
            iki=d;
        }
    }
}
