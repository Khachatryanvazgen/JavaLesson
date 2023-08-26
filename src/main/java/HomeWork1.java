import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        greatestNumber();

    }
    public static void greatestNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first Number:");
        int x = scanner.nextInt();
        System.out.println("Write the second Number:");
        int y = scanner.nextInt();
        System.out.println("Write the last Number:");
        int z = scanner.nextInt();

        if (x > y && x > z)
            System.out.println(x + " The x is a greatest number");
        else if (y > x && y > z)
            System.out.println(y + " The y is a greatest number");
        else if (z > x && z > y)
            System.out.println(z + " The z is a greatest number");
        else
            System.out.println("The Greatest Number is Not Found");
    }

}
