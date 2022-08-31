package KosulluIfadeler;
import java.util.Scanner;;

public class SinifGecmeDurum {
    public static void main(String[] args) {
      
        int mat,fizik,turkce,kimya,muzik,Avg=0,hesplananDers=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Türkçe notunu girin: ");
        turkce=inp.nextInt();

        System.out.println("Matematik notunu girin: ");
        mat=inp.nextInt();

        System.out.println("Fizik notunu girin: ");
        fizik=inp.nextInt();

        System.out.println("Kimya notunu girin: ");
        kimya=inp.nextInt();

        System.out.println("Müzik notunu girin: ");
        muzik=inp.nextInt();

        inp.close();

        if(turkce>=0 && turkce<=100){
            Avg=Avg+turkce;
            hesplananDers +=1;
        }
        
        if(mat>=0 && mat<=100){
            Avg=Avg+mat;
            hesplananDers +=1;
        }
        
        if(fizik>=0 && fizik<=100){
            Avg=Avg+fizik;
            hesplananDers +=1;
        }
        
        if(kimya>=0 && kimya<=100){
            Avg=Avg+kimya;
            hesplananDers +=1;
        }
        
        if(muzik>=0 && muzik<=100){
            Avg=Avg+muzik;
            hesplananDers +=1;
        }

        Avg = Avg/hesplananDers;
        System.out.println(Avg>55 ? "Sınıfı geçti":"Sınıfı geçemedi");
    }
    
}
