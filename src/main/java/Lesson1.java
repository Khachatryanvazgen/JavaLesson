import java.util.Scanner;

public class Lesson1 {


    public static void main(String[] args) {
//        greatestNumber();
// compaereNumbers();
         //calculateFactorial();
        //calculateAverage();
        averageCalculate();
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
            System.out.println(x + "The x is a greatest number");
        else if (y > x && y > z)
            System.out.println(y + "The y is a greatest number");
        else if (z > x && z > y)
            System.out.println(z + "The z is a greatest number");
        else
            System.out.println("The Greatest Number is Not Found");
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


    //CalculateFactorial
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

    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the count of the Numbers");
//        int numCount = scanner.nextInt();

        int sum = 0;
//        if (numCount <= 0){
//            System.out.println("incorrect input data ");
//        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the " + i + "(first) number");
            int count = scanner.nextInt();
            sum += count;
        }
        double average = sum / 5;
        System.out.println("Average: " + average);
    }

    public static void averageCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the count of the Numbers");
        int numCount = scanner.nextInt();

        int sum = 0;
        if (numCount <= 0) {
            System.out.println("incorrect input data ");
        }

        for (int i = 1; i <= numCount; i++) {
            System.out.println("Enter the " + i + "(first) number");
            int count = scanner.nextInt();
            sum += count;
        }
        double average = sum / numCount;
        System.out.println("Average: " + average);


    }
}