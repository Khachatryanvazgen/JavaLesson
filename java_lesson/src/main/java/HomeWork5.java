import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        //calculateAverage();
        averageCalculate();

    }
    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the " + i + "(first) number");
            int count = scanner.nextInt();
            sum += count;
        }
        double average = sum / 5;
        System.out.println("Average: " + average);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void averageCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the count of the Numbers");
        int numCount = scanner.nextInt();

        int sum = 0;
        if (numCount <= 0) {
            System.out.println("incorrect input data ");
        }

        for (int i = 1; i <= numCount; i++) {
            System.out.println("Enter the " + i + "number");
            int count = scanner.nextInt();
            sum += count;
        }
        double average = sum / numCount;
        System.out.println("Average: " + average);


    }
}
