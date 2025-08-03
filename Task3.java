import java.util.Arrays;

public class Task3 {
    
    public static void main(String[] args) {

        java.util.Random rnd = new java.util.Random();

        int min = 163;
        int max = 190;

        int[] peopleArr = new int[12];

        for (int i = 0; i < peopleArr.length; i++) {
            int value = rnd.nextInt(max - min + 1) + min;
            peopleArr[i] = value;
        }

        String tmpl = "%-23s %s\n";

        System.out.printf(tmpl, "Исходный массив: ", Arrays.toString(peopleArr));
        java.util.Arrays.sort(peopleArr);
        System.out.printf(tmpl, "Отсортрованный массив: ", Arrays.toString(peopleArr));
    }
}
