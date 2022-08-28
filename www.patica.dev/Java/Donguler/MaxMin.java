package Donguler;
import java.util.Scanner;;

public class MaxMin {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int adet,max,min,num;
            
            System.out.println("Kaç adet sayı girmek istersiniz: ");
            adet=inp.nextInt();
            
            System.out.print("Sayı girin: ");
                max=inp.nextInt();
                min=max;

            for (int i = 0; i < adet-1; i++) {
                System.out.print("Sayı girin: ");
                num=inp.nextInt();

                if(num>max){
                    max=num;
                }
                if(num<min)
                    min=num;
            }
            System.out.println("Max: "+max+"\nMin: "+min);
        }
        
    }
}
