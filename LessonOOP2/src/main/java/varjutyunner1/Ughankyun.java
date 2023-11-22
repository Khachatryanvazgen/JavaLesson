package varjutyunner1;

import java.util.Scanner;

public class Ughankyun extends ErkchapPatkerner {

    public boolean invalidInput(){
        return a == b || a <= 0 || b <= 0;
}
    @Override
    public double hashvelMakeres() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter Length a");
            this.a = scanner.nextInt();

            System.out.println("Enter Length b");
            this.b = scanner.nextInt();

            if (invalidInput()){
                System.out.println("Invalid input please try again");
            }
        }while (invalidInput());
        return a*b;

    }

    @Override
    public double hashvelParagits(){
        return 2 * (a+b);
    }
}

