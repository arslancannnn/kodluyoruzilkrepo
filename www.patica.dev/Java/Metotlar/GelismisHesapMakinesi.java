package Metotlar;
import java.util.Scanner;;

public class GelismisHesapMakinesi {
   static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
       
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        int select;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    Alan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
        inp.close();
    }

    static void plus(){
      
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = inp.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
        
    }

    static void minus(){
      
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = inp.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
        
    }

    static void times(){
      
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = inp.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
        inp.close();
    }

    static void divided(){
      
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = inp.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = inp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
        
    }

    static void power(){
      
        System.out.print("Taban değeri giriniz :");
        int base = inp.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
        

    }

    static void factorial(){
    
        System.out.print("Sayı giriniz :");
        int n = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
      
        System.out.println("Sonuç : " + result);
        
    }

    static void Alan(){
   
        int kisa,uzun;

        System.out.println("Kısa kenarı girin:");
        kisa= inp.nextInt();
        System.out.println("Uzun kenarı girin: ");
        uzun= inp.nextInt();

        System.out.println("Çevre: "+((2*(kisa+uzun)))+"\n"+"Alan: "+kisa*uzun);
        
    }

    static void mod(){
      
        int num,mod;

        System.out.println("Modu alınacak sayıyı girin: ");
        num = inp.nextInt();
        System.out.println("Modu girin: ");
        mod=inp.nextInt();

        System.out.println(num+" Sayısının "+mod+" göre modu: "+num%mod);
        
    }
}
