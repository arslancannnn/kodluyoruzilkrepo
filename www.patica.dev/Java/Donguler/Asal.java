package Donguler;

public class Asal {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if(i% 2 == 0 && i != 2){
                continue;
            }else if(i % 3 == 0 && i !=3){
                continue;
            }else if(i % 5 == 0 && i!=5){
                continue;
            }else if(i % 7 == 0 && i!=7){
                continue;
            }else{
                System.out.print(i+" ");
            }
        
        }
    }
    
}
