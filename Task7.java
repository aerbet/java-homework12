
import java.util.Arrays;

public class Task7 {
    
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();

        int boxerCount = rnd.nextInt(25 - 10 + 1) + 10;

        int[] boxerArr = new int[boxerCount];
        int lightIndex = 0, welterIndex = 0, middleIndex = 0, cruiserIndex = 0;

        for (int i = 0; i < boxerArr.length; i++) {
            int boxerWeight = rnd.nextInt(81 - 50 + 1) - 50;
            
            if (boxerWeight < 0) {
                System.out.println("Вес боксёра не может быть отрицательным");
                break;
            } else {
                boxerArr[i] = boxerWeight;
            }

            if (boxerWeight <= 63) {
                lightIndex++;
            } else if (boxerWeight <= 69 && boxerWeight >= 64) {
                welterIndex++;
            } else if (boxerWeight <= 75 && boxerWeight >= 70) {
                middleIndex++;
            } else {
                cruiserIndex++;
            }
        }

        System.out.println(Arrays.toString(boxerArr));

        String tmpl = "Количество %-15s: %d\n";

        System.out.printf(tmpl, "легковесов", lightIndex);
        System.out.printf(tmpl, "полусредневесов", welterIndex);
        System.out.printf(tmpl, "средневесов", middleIndex);
        System.out.printf(tmpl, "полутяжеловесов", cruiserIndex);
        
    }
}
