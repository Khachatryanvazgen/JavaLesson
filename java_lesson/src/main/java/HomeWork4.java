import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        calculateFactorial();

    }
    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number which Factorial you want calculate:");
        int n = scanner.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {

            result *= i;

        }
        System.out.println(result);
    }
}
