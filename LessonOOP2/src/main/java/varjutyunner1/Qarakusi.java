package varjutyunner1;

public class Qarakusi extends ErkchapPatkerner{

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
    @Override
    public double hashvelParagits(){
        return 2*(a+b);
    }
}