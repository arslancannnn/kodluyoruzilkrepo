package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n1,n2,Select;

        System.out.println("İlk sayıyı girin: ");
        n1 = Input.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        n2 = Input.nextInt();
        System.out.println("Yapılacak işlem:");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        Select=Input.nextInt();

        Input.close();

        switch(Select){
            case 1:
                System.out.println("Toplam :" +(n1+n2));
                break;

            case 2:
                System.out.println("Fark :" +(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım :" +(n1*n2));
                break;
            case 4:
                System.out.println("Bölüm :" +(n1/n2));
                break;
            
        }
        
    }
    
}
