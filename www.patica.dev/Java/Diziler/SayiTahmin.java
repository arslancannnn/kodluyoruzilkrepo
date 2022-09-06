package Diziler;
import java.util.Arrays;
import java.util.Scanner;

public class SayiTahmin {

   
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner inp = new Scanner(System.in);
        
        int right = 0,selected;
        int[] wrong = new int[5];
        boolean isWin = false,isWrong = false;
        

        while (right<5) {
            System.out.println("-------------------------------");
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if(number == selected){
                
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            }else{
                
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
            
        }
        inp.close();

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Gizli sayı: "+number);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
        
    }
}
