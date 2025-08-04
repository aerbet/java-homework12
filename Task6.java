import java.util.Arrays;

public class Task6 {
    
    public static void main(String[] args) {
       java.util.Random rnd = new java.util.Random();

        int arrLength = rnd.nextInt(10 - 3 + 1) + 3;

        int[] numsArr = new int[arrLength];
        int[] ngtArr = new int[arrLength];
        int[] posArr = new int[arrLength];

        int[] evenNums = new int[arrLength];
        int[] oddNums = new int[arrLength];

        int posIndex = 0, negIndex = 0, evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < numsArr.length; i++) {
            int value = rnd.nextInt(10 - (-10) + 1) - 10;

            numsArr[i] = value;

            if (value < 0) {
                ngtArr[negIndex++] = value;
            } else {
                posArr[posIndex++] = value;
            }

            if (value % 2 == 0) {
                evenNums[evenIndex++] = value;
            } else {
                oddNums[oddIndex++] = value;
            }
        }

        String tmpl = "Массив положительных чисел: %s\nМассив отрицательных чисел: %s\n";
        String tmpl2 = "Количество четных чисел: %4d\nКоличество нечетных чисел: %2d";

        System.out.println("Исходный массив: " + Arrays.toString(numsArr) + "\n");

        System.out.printf(tmpl, Arrays.toString(Arrays.copyOf(posArr, posIndex)), Arrays.toString(Arrays.copyOf(ngtArr, negIndex)));
        System.out.printf(tmpl2, Arrays.copyOf(evenNums, evenIndex).length, Arrays.copyOf(oddNums, oddIndex).length);
    }
}