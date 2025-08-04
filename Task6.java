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

        for (int i = 0; i < numsArr.length; i++) {
            int value = rnd.nextInt(10 - (-10) + 1) - 10;

            numsArr[i] += value;

            if (value < 0) {
                ngtArr[i] += value;
            } else {
                posArr[i] += value;
            }

            if (value % 2 == 0) {
                evenNums[i] += value;
            } else {
                oddNums[i] += value;
            }
        }

        int[] newArr = Arrays.stream(evenNums).filter(x -> x != 0).toArray();
        int[] newArr2 = Arrays.stream(oddNums).filter(x -> x != 0).toArray();

        String tmpl = "Количество четных чисел: %d\nКоличество нечетных чисел: %d";

        System.out.println(Arrays.toString(numsArr));
        System.out.println(Arrays.toString(Arrays.stream(ngtArr).filter(x -> x != 0).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(posArr).filter(x -> x != 0).toArray()));
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr2));

        System.out.printf(tmpl, newArr.length, newArr2.length);
    }
}