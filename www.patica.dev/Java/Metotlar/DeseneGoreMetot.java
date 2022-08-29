package Metotlar;
import java.util.Scanner;;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int num = inp.nextInt();
        inp.close();
        minusDesen(num,num);

    }
    static void minusDesen(int num,int temp){
        
        if(num>0){
            System.out.print(num+" ");
            minusDesen(num-5, temp);
            return ;

        }else if(num<=0){
            System.out.print(num+" ");
            plusDesen(num+5, temp);
            return ;
        }
        
        
        
    }
    static void plusDesen(int num, int temp){
            if(num==temp){
                System.out.print(num+" ");
                return;
            }
            else if(num<temp){
                System.out.print(num+" ");
                plusDesen(num+5, temp);
                return;
            }
    }
}
