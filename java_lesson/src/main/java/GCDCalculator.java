import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        calculateGCD();
    }
//    public static void calculateGCD() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("GCD Calculator");
//        System.out.println("Enter the first number: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter the second number: ");
//        int secondNumber = scanner.nextInt();
//        int gcd = 1;
//        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
//            if (firstNumber % i == 0 && secondNumber % i == 0) {
//                gcd = i;
//            }
//        }
//        System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is " + gcd);
//    }
public static void calculateGCD() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("GCD Calculator");

    System.out.println("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    System.out.println("Enter the second number: ");
    int secondNumber = scanner.nextInt();

    int gcd = 1;
    for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
        if (firstNumber % i == 0 && secondNumber % i == 0) {
            gcd = i;
        }
    }
    System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is " + gcd);

    }

}

