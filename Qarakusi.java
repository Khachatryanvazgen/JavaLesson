package Varjutyunner;

public class Qarakusi extends ErkchapPatker{

    public Qarakusi(int x){
        setSquareSide(x);
    }
    public void setSquareSide(int x){
        if (x <= 0){
            System.out.println("Square side should be > 0 ");
        }else {
            a = x;
            b = x;
        }
    }
    @Override
    public double hashvelMakeres(){
        return a*b;
    }
}
