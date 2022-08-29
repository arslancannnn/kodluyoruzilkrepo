package Metotlar;
import java.util.Scanner;;

public class RecursiveAsal {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int i=2,num = inp.nextInt();
        inp.close();
        Asal(num, i);
    }
    static void Asal(int num, int i){
        if(num==i){
            System.out.println(num+" Bir asal sayı");
            return;
        }else if(num % i == 0){
            System.out.println(num+" Bir asal sayı değil");
            return;
        }
        Asal(num, i+1);
    }
}
