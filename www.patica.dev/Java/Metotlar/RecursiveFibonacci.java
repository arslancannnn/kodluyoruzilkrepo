package Metotlar;
import java.util.Scanner;;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
       
        System.out.println("Bir sayı girin: ");
        int num = inp.nextInt();
        inp.close();
        
        System.out.println(fibonacci(num)); 
        
    }
    static int fibonacci(int num){
        if(num == 1 || num == 2)
            return 1;
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
