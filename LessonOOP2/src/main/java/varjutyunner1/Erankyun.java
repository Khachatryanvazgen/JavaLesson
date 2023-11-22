package varjutyunner1;
import java.util.Scanner;

public class Erankyun extends ErkchapPatkerner{
    private int c;

    public Erankyun(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Side a");
        this.a = scanner.nextInt();
        System.out.println("input Side b");
        this.b = scanner.nextInt();
        System.out.println("input Side c");
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
    @Override
    public double hashvelParagits(){
        return (a+b+c);
    }

}

