package Donguler;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {

            String userName,password;
            int right =3;
            int balance=1500;
            int select;

            while(right>0){
                System.out.println("Kullanıcı adınız: ");
                userName= inp.nextLine();
                System.out.println("Şifreniz: ");
                password=inp.nextLine();

                if(userName.equals("patika") && password.equals("dev123")){
                    do {
                        System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = inp.nextInt();

                        switch (select) {
                            case 1:
                                System.out.print("Yatırmak isteğiniz para miktarı : ");
                                int price = inp.nextInt();
                                balance += price;
                                break;
                            case 2:
                                System.out.println("Çekmek istediğiniz tutar: ");
                                int pr =inp.nextInt();
                                if(pr<balance)
                                    balance=balance-pr;
                                else
                                    System.out.println("Yetersiz bakiye");
                                break;
                            case 3:
                                System.out.println("Bakiyeniz: "+balance);
                                break;
                            default:
                                System.out.println("ERROR!!!");
                                break;
                        }
                    } while (select !=4);
                }else{
                    right--;
                    if(right==0){
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz");
                    }else{
                        System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                        System.out.println("Kalan hakkınız: "+right);
                    }
                }
            }
        }
    }
}
