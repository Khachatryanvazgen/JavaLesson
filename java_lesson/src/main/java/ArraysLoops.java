import java.util.Random;
import java.util.Scanner;

public class ArraysLoops {
    public static void main(String[] args) {
        random();
//        int[] numbers = new int [5];
//        System.out.println(numbers[3]);
//        numbers[0]=5;
//        numbers[1]=12;
//        numbers[3]= 25;
//
//        System.out.println(numbers[3] + numbers[0]);
//        System.out.println(numbers.length);

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
