package HomeWorks1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(0005);
        ReverseNumber();
    }

    public static void ReverseNumber() {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Number");
            int number = scanner.nextInt();

            int rev = 0;
            while (number != 0) {
                int cloud = number % 10;
                rev = rev * 10 + cloud;
                number /= 10;

            }
            System.out.println(rev);
        }

    }
}