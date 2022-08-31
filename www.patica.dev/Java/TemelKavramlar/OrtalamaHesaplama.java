package TemelKavramlar;
import java.util.Scanner;;;

public class OrtalamaHesaplama{
    public static void main(String[] args) {
    
    Scanner Input = new Scanner(System.in);

        System.out.println("Matematik notunu girin;");
        int Mat = Input.nextInt();

        System.out.println("Fizik notunu girin;");
        int Fizik = Input.nextInt();

        System.out.println("Kimya notunu girin;");
        int Kimya = Input.nextInt();

        System.out.println("Türkçe notunu girin;");
        int Tr = Input.nextInt();

        System.out.println("Tarih notunu girin;");
        int Tarih = Input.nextInt();

        System.out.println("Müzik notunu girin;");
        int Muzik = Input.nextInt();

        Input.close();
        
        int Avg = (Mat+Fizik+Kimya+Tr+Tarih+Muzik)/6;

    System.out.println("Ortalama: "+Avg);
    System.out.println(Avg > 60 ? "Sınıfı geçti": "Sınıfı geçemedi");

       
    }
}