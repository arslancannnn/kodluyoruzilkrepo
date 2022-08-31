package KosulluIfadeler;
import java.util.Scanner;;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("Bir yıl girin: ");
        int yil = inp.nextInt();
        inp.close();

        if(yil%4==0){
            if(yil%100==0)
                System.out.println(yil%400==0 ? yil+" bir artık yıldır." : yil+" bir artık yıl değildir");
            else  
                System.out.println(yil+" bir artık yıldır");   
        }else
            System.out.println(yil+" bir artık yıl değildir");
    }
    
}
