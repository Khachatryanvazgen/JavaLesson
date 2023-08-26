import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
 compaereNumbers();

    }
    public static void compaereNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first Number:");
        int x = scanner.nextInt();
        System.out.println("Write the second Number:");
        int y = scanner.nextInt();
        System.out.println("Write the last Number:");
        int z = scanner.nextInt();

        if (x == y && y == z)
            System.out.println("The all numbers are equal");
        else if (x != y && y != z)
            System.out.println("The all numbers are different");
        else
            System.out.println("Neither all are equal or different");

    }
}
