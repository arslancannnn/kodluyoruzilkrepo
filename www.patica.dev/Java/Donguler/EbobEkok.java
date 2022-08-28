package Donguler;
import java.util.Scanner;;

public class EbobEkok {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int num1,num2,temp,ebob=1,i=1;
            
            System.out.println("1. sayıyı girin: ");
            num1= inp.nextInt();
            System.out.println("2. Sayıyı girin: ");
            num2=inp.nextInt();

            if(num1<num2)
                temp=num1;
            else
                temp=num2;
            
            while(i<=temp){
                if(num1 % i == 0 && num2 % i == 0){
                    ebob=i; 
                }
                i++;
            }
            System.out.println("Ebob: "+ebob);
            System.out.println("Ekok: "+(num1*num2)/ebob);
           
        }
        
    }
}
