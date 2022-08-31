package Siniflar.Box;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 12 , 100, 90, 10);
        Fighter alex = new Fighter("Alex" , 10 , 103, 100, 23);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
