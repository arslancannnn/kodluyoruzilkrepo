package KosulluIfadeler;
import java.util.Scanner;;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName,password,yn;
        int a=1;

        Scanner inp =new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        userName=inp.nextLine();

        System.out.print("Şifre: ");
        password= inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı!");

        }else{
            System.out.println("Giriş başarısız!");
            System.out.println("Şifrenisi değiştirmek ister misiniz? y/n");
            yn = inp.nextLine();
            
            switch (yn) {
                case "y":

                    while (a==1) {
                        System.out.println("Yeni şifrenizi girin: ");
                        password= inp.nextLine();

                        if(password.equals("java123")){
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }else{
                            System.out.println("Şifre başarı ile değiştirildi");
                            a=0;
                        }
                    }        
                    break;

                case "n":
                    System.out.println("Çıkış yapılıyor");
                    break;
                
                default:
                        System.out.println("ERROR!!!");
                        break;
            }
           

        }
        inp.close();
        
    }
    
}
