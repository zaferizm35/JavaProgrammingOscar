package mainSquare;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        square s = new square(in.nextDouble());
        cube c = new cube(in.nextDouble());
        rectangle r = new rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.getLength());
        r.setLength(in.nextDouble());
        System.out.println(r.getLength());
        System.out.println(s.getLength());
        System.out.println(s.circumferenceCalc());
        System.out.println(c.circumferenceCalc());

    }
}
