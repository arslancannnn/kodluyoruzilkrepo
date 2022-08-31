package TemelKavramlar;
import java.util.Scanner;;

public class DaireAlan {
    public static void main(String[] args) {
        double P=3.14, A,R,Alan;
        Scanner Input = new Scanner(System.in);

        System.out.print("Yarıçapı girin:");
        R=Input.nextDouble();
        System.out.print("Açı çlçüsünü girin");
        A=Input.nextDouble();

        Input.close();

        Alan=(P*R*R*A)/360;
        System.out.println("Alan: "+Alan);
    }
    
}
