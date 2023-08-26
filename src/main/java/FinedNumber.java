import java.util.Random;
import java.util.Scanner;

public class FinedNumber {
    public static void main(String[] args) {
        random();


    }

    public static void random() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();

        int rand = random.nextInt(startValue, endValue);

        int count = 1;
        while (true) {
            System.out.println("Guess the number");
            int num = scanner.nextInt();

            if (num == rand) {
                System.out.println("Congratulations");
                System.out.println("The correct number is " + num + " you tried " + count + " times");
                break;

            } else if (num > rand) {
                System.out.println("The chosen number is bigger, Try again");
            } else {
                System.out.println("The chosen number is lower, Try again");
            }
            count++;

        }

    }
}
