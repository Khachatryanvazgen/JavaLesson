import java.util.Random;
import java.util.Scanner;

public class FinedNumber {
    public static void main(String[] args) {
        random();


    }

    public static void random() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int rand = random.nextInt(0, 10);

        while (true) {
            System.out.println("Guess the number");
            int i = 1;
            int num = scanner.nextInt();

            if (num == rand) {
                System.out.println("Congratulations");
                System.out.println("vazgen " + i);
                break;

            } else if (num > rand) {
                System.out.println("The chosen number is bigger, Try again");
            } else {
                System.out.println("The chosen number is lower, Try again");
            }


        }

    }
}
