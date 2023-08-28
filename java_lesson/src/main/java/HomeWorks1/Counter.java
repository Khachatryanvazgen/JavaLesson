package HomeWorks1;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        counter();
        //counter2();
    }

    public static void counter() {
        Scanner scanner = new Scanner(System.in);

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        char Stop;

        do {
            System.out.println("Input Number");
            int input = scanner.nextInt();

            if (input > 0) {
                posCount++;
            } else if (input < 0) {
                negCount++;
            } else {
                zeroCount++;
            }

            System.out.println("want to continue? (y/n):");
            Stop = scanner.next().charAt(0);
        }
        while (Stop == 'Y' || Stop == 'y');
        System.out.println("Positive Count is " + posCount);
        System.out.println("Negative Count is " + negCount);
        System.out.println("Zero's Count is " + zeroCount);

    }

    public static void counter2() {
        Scanner scanner = new Scanner(System.in);


        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int Stop = 0;

        while (true) {

            System.out.println("Input Number");
            int input = scanner.nextInt();

            if (input > 0) {
                posCount++;
            } else if (input < 0) {
                negCount++;
            } else {
                zeroCount++;
            }



            System.out.println("Positive Count is " + posCount);
            System.out.println("Negative Count is " + negCount);
            System.out.println("Zeros Count is " + zeroCount);


        }
    }
}