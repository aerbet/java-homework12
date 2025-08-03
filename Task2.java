import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 9");
        int numFromUser = sc.nextInt();

        String tmpl = "%d * %d = %2d\n";

        for (int i = 1; i < 10; i++) {
            int result = numFromUser * i;
            System.out.printf(tmpl, numFromUser, i, result);
        }

        sc.close();
    }
}
