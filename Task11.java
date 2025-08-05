import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Random rnd = new java.util.Random();

        int x = 5;
        int y = 5;
        int result = 0;
        
        int[][] matrix = new int[y][x];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int nums = rnd.nextInt(30 - (-5) + 1) - 5;

                matrix[i][j] = nums;
                result += matrix[i][j];
            }
        }

        
        for (int[] m : matrix) {
            System.out.println(Arrays.toString(m));
        }

        System.out.print("\nВыберите ряд от 1 до 5 из нашей матрицы: ");
        int str = sc.nextInt();
        System.out.print("Выберите строку от 1 до 5 из нашей матрицы: ");
        int str2 = sc.nextInt();
        System.out.println();

        int col = 0;
        int row = 0;

        for (int i = 0; i < y; i++) {
            col += matrix[i][str - 1];
            row += matrix[str2 - 1][i];
        }

        String tmpl = "Сумма %s %s: %d\n";

        System.out.printf(tmpl, "ряда номер", str, col);
        System.out.printf(tmpl, "строки номер", str2, row);
        System.out.printf(tmpl, "всех элементов матрицы", "", result);

        sc.close();
    }
}