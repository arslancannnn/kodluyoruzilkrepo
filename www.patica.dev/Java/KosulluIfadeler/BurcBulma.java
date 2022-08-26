package KosulluIfadeler;
import java.util.Scanner;;

public class BurcBulma {
    public static void main(String[] args) {
        String ay;
        int gun;
        Scanner inp =new Scanner(System.in);

        System.out.println("Doğduğunuz ay: ");
        ay=inp.nextLine();

        System.out.println("Doğduğunuz gün:");
        gun=inp.nextInt();

        if((ay.equals("mart") && gun>=21) || (ay.equals("nisan") && gun<=20)){
            System.out.println("Koç burcusunuz");
        }
        else if((ay.equals("nisan") && gun>=21) || (ay.equals("mayis") && gun<=21)){
            System.out.println("Boğa burcusunuz");
        }
        else if((ay.equals("mayis") && gun>=22) || (ay.equals("haziran") && gun<=22)){
            System.out.println("İkizler burcusunuz");
        }
        else if((ay.equals("haziran") && gun>=23) || (ay.equals("temmuz") && gun<=22)){ 
            System.out.println("Yengeç burcusunuz");
        }
        else if((ay.equals("temmuz") && gun>=23) || (ay.equals("agustos") && gun<=22)){
            System.out.println("Aslan burcusunuz");
        }
        else if((ay.equals("agustos") && gun>=23) || (ay.equals("eylul") && gun<=22)){
            System.out.println("Başak burcusunuz");
        }
        else if((ay.equals("eylul") && gun>=23) || (ay.equals("ekim") && gun<=22)){
            System.out.println("Terazi burcusunuz");
        }
        else if((ay.equals("ekim") && gun>=23) || (ay.equals("kasim") && gun<=21)){
            System.out.println("Akrep burcusunuz");
        }
        else if((ay.equals("kasim") && gun>=22) || (ay.equals("aralik") && gun<=21)){
            System.out.println("Yay burcusunuz");
        }
        else if((ay.equals("aralik") && gun>=22) || (ay.equals("ocak") && gun<=21)){
            System.out.println("Oğlak burcusunuz");
        }
        else if((ay.equals("ocak") && gun>=22) || (ay.equals("subat")&&gun<=19)){
            System.out.println("Kova burcusunuz");
        }
        else if((ay.equals("subat") && gun>19) || (ay.equals("mart") && gun<=20)){
            System.out.println("Balık burcusunuz");
        }
       
        }  

    
}
