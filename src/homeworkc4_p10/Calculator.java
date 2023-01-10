package homeworkc4_p10;

public class Calculator {
    private  Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }


}
