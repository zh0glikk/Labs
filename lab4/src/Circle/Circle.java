package Circle;

public class Circle {
    protected double a;

    public Circle(double a) {
        this.a = a;
        System.out.println("Circle constructor with parametrs");
    }
    public Circle() {
        this(1);
        System.out.println("Circle constructor default");
    }

    public double countLength() {
        return 2 * Math.PI * a;
    }

    public double countSquare() {
        return Math.PI *Math.pow(a, 2);
    }

    public void view() {
        System.out.println("Circle radius = " + this.a);
    }
}
