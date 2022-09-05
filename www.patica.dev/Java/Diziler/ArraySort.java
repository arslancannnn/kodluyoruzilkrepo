package Diziler;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        System.out.println("Eleman sayısını girin: ");
        int temp=0, length = inp.nextInt();
        int[] list = new int[length];
        
        

        for (int i = 0; i < list.length; i++) {
            System.out.print(i+". eleman: ");
            list[i]= inp.nextInt();
        }
        inp.close();

        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if(list[i] > list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("---------------------------------\n"+"Sıralanmış liste: ");
        for (int i : list) {
            System.out.print(i+", ");
        }
    }
}
