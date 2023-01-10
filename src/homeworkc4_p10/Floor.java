package homeworkc4_p10;

public class Floor {
    double length;
    double width;

    public Floor(double width, double length){
        if (width<0){
            this.width=0;
        }
        else {
            this.width=width;
        }
        if(length<0){
            this.length=0;
        }else {
            this.length=length;
        }
    }
    public double getArea(){
        return width*length;
    }
}
