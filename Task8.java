import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();

        int length = rnd.nextInt(15 - 3 + 1) + 3;

        int[] arr = new int[length];

        for (int i = 0; i < arr.length;) {
            int value = rnd.nextInt(15);
            boolean exist = false;
            
            for (int j = 0; j < i; j++) {
                if (arr[j] == value) {
                    exist = true;
                    break;
                }
            }

            if (!exist) {
                arr[i] = value;
                i++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}

