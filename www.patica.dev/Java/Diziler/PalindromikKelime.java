package Diziler;

import java.util.Scanner;

public class PalindromikKelime {
    
    static boolean isPalindrom(String str){
        
        int i=0, j= str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir kelime girin: ");
        String str = inp.nextLine();
        inp.close();

        System.out.println(isPalindrom(str) ? str+" kelimesi palindromdur." : str+" kelimesi palindrom değildir.");
    }
}
