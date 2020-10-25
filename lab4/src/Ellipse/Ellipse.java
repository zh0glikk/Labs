package Ellipse;

import Circle.Circle;

public class Ellipse extends Circle {
    private double b;

    public Ellipse(double a, double b) {
        super(a);
        this.b = b;
        System.out.println("Ellipse constructor with parametrs");
    }

    public Ellipse() {
        this.a = 1;
        this.b = 2;
        System.out.println("Ellipse constructor default");
    }

    @Override
    public void view() {
        System.out.println("Ellipse minor semiaxis = " + this.a);
        System.out.println("Ellipse major semiaxis = " + this.b);
    }
}
