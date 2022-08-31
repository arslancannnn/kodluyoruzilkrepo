package KosulluIfadeler;
import java.util.Scanner;;

public class EtkinlikOnerme {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.println("Sıcaklığı girin: ");
        heat=inp.nextInt();

        inp.close();

        if(heat<5){
            System.out.println("Bugün kayağa gidebilirsin");
        }else if(heat>=5 && heat<=25){
            if(heat<15)
                System.out.println("Bugün sinemaya gidebilirsin");
            if(heat>10)
                System.out.println("Bugün pikniğe gidebilirsin");
        }else 
            System.out.println("Bugün yüzmeye gidebilirsin");
    }
    
}
