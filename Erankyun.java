package Varjutyunner;

import java.util.Scanner;

public class Erankyun extends ErkchapPatker{
    private int c;

    public Erankyun(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
        this.c = scanner.nextInt();

        while(c >= a+b || a >= c+b || b >= a+c){
            System.out.println("Please try again");
            this.c = scanner.nextInt();
        }
    }

    @Override
    public double hashvelMakeres(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
