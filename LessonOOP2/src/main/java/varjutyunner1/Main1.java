package varjutyunner1;

public class Main1 {
    public static void main(String[] args) {

            Qarakusi qarakusi = new Qarakusi(5);

            System.out.println(qarakusi.hashvelMakeres());

            System.out.println("--------------------Erankyun----------------------");

            Erankyun erankyun = new Erankyun();

            System.out.println("Er Makeres " + erankyun.hashvelMakeres());
            System.out.println("Er Paragits " + erankyun.hashvelParagits());


            System.out.println("--------------Ughankyun-------------------------");
            Ughankyun ughankyun = new Ughankyun();

            System.out.println("Makerers " + ughankyun.hashvelMakeres());
            System.out.println("Paragits " + ughankyun.hashvelParagits());


    }
}
