package Donguler;
import java.util.Scanner;;

public class GirilenSayiKadarKuvvet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
<<<<<<< HEAD
=======
        long carpim=1
>>>>>>> ec59a80844827a73cbaa142dc7a2cd0e91a21f7a
        System.out.println("Bir sayı girin: ");
        num=inp.nextInt();
        System.out.println("4'ün kuvvetleri: ");
        for (int i = 1; i <= num; i*=4) {
            System.out.print(i+"\t");

        }
        System.out.println("\n5'in kuvvetleri: ");
        for (int i = 1; i <= num; i*=5) {
            System.out.print(i+"\t");
    
        }
    }
    
}
