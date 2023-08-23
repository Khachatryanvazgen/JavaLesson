import java.util.Scanner;

public class Patern2 {
    public static void main(String[] args) {
        Patern();

    }

    public static void Patern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number ");
        int number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}