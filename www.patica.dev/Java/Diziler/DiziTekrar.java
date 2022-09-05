package Diziler;

public class DiziTekrar {
    static boolean isExist(int[] list, int value){
        for (int i : list) {
            if(i == value){
                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        
        int[] list = {5,0,9,0,6,0,3,1,9,4,6,2,3,4,6,9};
        int sayac = 0;
        int[] duplicate = new int[list.length];
        
        for (int i = 0; i < duplicate.length; i++) {
            duplicate[i]=1; //duplicate dizisinin default değerlerini 1'e eşitledik
        }

        for (int i = 0; i < list.length; i++) {
            
            for (int j = 0; j < list.length; j++) {
                
                if((i != j) && list[i] == list[j] && list[i] % 2 == 0){
                   if(!isExist(duplicate, list[i])){
                        duplicate[sayac++] = list[i];
                   }
                        
                    break;   
                }
            }
        }
        for (int i : duplicate) {
           
           if(i != 1){
            System.out.print(i+", ");
           } 
        }
    }
}
