package mainSquare;

class rectangle extends square{
private double height;

public rectangle(double len , double height){
        super(len);
        this.height=height;
        }

public double circumferenceCalc(){
        return getLength()*2+height*2;

        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
        }
}