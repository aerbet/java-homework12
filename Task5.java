import java.util.Arrays;

public class Task5 {
    
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();

        int value = rnd.nextInt(15 - 1 + 1) + 1;

        int[] arrValue = new int[value];
        int result = 0;

        for (int i = 0; i < arrValue.length; i++) {
            int precip = rnd.nextInt(50 - 0 + 1) + 0;
            arrValue[i] = precip;

            result += arrValue[i];
        }

        System.out.println(Arrays.toString(arrValue));

        System.out.println("Среднедневное количество осадков: " + result / arrValue.length);

        int maxIndex = Arrays.stream(arrValue).max().getAsInt();
        int maxIndexDay = 0;

        for (int i = 0; i < arrValue.length; i++) {
            if (arrValue[i] == maxIndex) {
                maxIndexDay = i + 1;
            }
        }

        String tmpl = "Максимальное количество осадков: %s | было на %s-й день";

        System.out.printf(tmpl, maxIndex, maxIndexDay);

        // for (int i = 0; i < arrValue.length / 2; i++) {
        //     int rev = arrValue[i];

        //     arrValue[i] = arrValue[arrValue.length - i - 1];
        //     arrValue[arrValue.length - i - 1] = rev;
        // }

        // System.out.println(Arrays.toString(arrValue));

        // System.out.println("Самое большое количество осадков: " + arrValue[0]);
    }
}