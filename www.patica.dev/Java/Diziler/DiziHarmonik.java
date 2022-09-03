package Diziler;

public class DiziHarmonik {
    public static void main(String[] args) {
        int[] numbers =  {1, 2, 3, 4, 5};
        double avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            avg += 1.0/numbers[i];
        }
        System.out.println(avg);
    }
}
