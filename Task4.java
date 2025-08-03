
import java.util.Arrays;


public class Task4 {
    
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();

        int value = rnd.nextInt(15 - 5 + 1) + 5;

        int[] numsArr = new int[value];

        numsArr[0] = 1;
        numsArr[1] = 1;

        String tmpl = "%-15s %s\n";

        for (int i = 2; i < numsArr.length; i++) {
            numsArr[i] = numsArr[i - 1] + numsArr[i - 2];
        }

        System.out.printf(tmpl, "Исходный массив: ", Arrays.toString(numsArr));
        
        for (int i = 0; i < numsArr.length / 2; i++) {
            int rev = numsArr[i];

            numsArr[i] = numsArr[numsArr.length - i - 1];
            numsArr[numsArr.length - i - 1] = rev;
        }

        System.out.printf(tmpl, "Обратный массив: ", Arrays.toString(numsArr));
     }
}
