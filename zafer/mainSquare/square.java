package mainSquare;

public class square {
    private double length;
    public square(double len){
        this.length=len;
    }
    public double circumferenceCalc(){
        return 4*length;
    }
    public double getLength(){
        return length;

    }
    public void setLength (double zafer){
        this.length=zafer;
    }


}