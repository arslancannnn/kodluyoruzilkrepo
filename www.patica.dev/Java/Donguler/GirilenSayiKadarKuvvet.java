package Donguler;
import java.util.Scanner;


public class GirilenSayiKadarKuvvet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        long carpim=1
        System.out.println("Bir sayı girin: ");
        num=inp.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println("Dördün "+i+". kuvveti: "+carpim);
            carpim *=4;

        }
        System.out.println("-----------------------------------");
        carpim=1;
        for (int i = 0; i <= num; i++) {
            System.out.println("Beşin "+i+". kuvveti: "+carpim);
            carpim *=5;
    
        }
    }
    
}
