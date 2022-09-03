package Diziler;
import java.util.Scanner;;

public class MaxMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0],max = list[0];
        System.out.println("Bir sayı girin: ");
        int num = inp.nextInt();
        inp.close();
        
        for (int i = 0; i < list.length; i++) {
            if(list[i] < num){
                min = list[i];
            }
            if(list[i] > num){
                max = list[i];
            }
        }
        if(num >= max || num <= min){
            System.out.println("Girdiğiniz sayı dizi aralığında değil!!");
        }else{
            for (int i = 0; i < list.length; i++) {
                if(list[i] < num && list[i] > min ){
                    min = list[i];
                }
                if(list[i] > num && list[i] < max){
                    max = list[i];
                }
            }
            System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
            System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
        }
        
        

    }
}
