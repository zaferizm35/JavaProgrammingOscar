package mainSquare;

public class cube extends  square {

    public cube(double len) {
        super(len);
    }
    public double circumferenceCalc(){
        return super.circumferenceCalc()*3;
    }
    public double volumeCalc(){
        return getLength()*getLength()*getLength();
    }
}
