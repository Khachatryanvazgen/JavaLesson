import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("  ");
//        }
        floatingPoint();
    }

    public static void floatingPoint() {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Number");
            double input = scanner.nextDouble();
            if (input == 0) {
                System.out.println("Number is " + input);
            }

            if (input > 0) {
                if (input < 1) {
                    System.out.println("Positive small Number");
                } else if (input > 1000000) {
                    System.out.println("Positive large number");
                } else {
                    System.out.println("Positiv number");
                }
            } else if (input < 0) {
                if (Math.abs(input) < 1) {
                    System.out.println(input + " is Negative small number");
                } else if (Math.abs(input) > 1000000) {
                    System.out.println(input + " is Negative large number");
                } else {
                    System.out.println(input + " is Negative number ");
                }
            }
        }
    }
}
