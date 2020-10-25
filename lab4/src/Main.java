import Circle.Circle;
import Ellipse.Ellipse;

public class Main {
    public static void main(String args[]) {
        Circle circle = new Circle(1);
        Ellipse ellipse = new Ellipse(1, 2);

        System.out.println("Circle Length = " + circle.countLength());
        System.out.println("Circle Square = " + circle.countSquare());
        System.out.println("Ellipse Length = " + ellipse.countLength());
        System.out.println("Ellipse Square = " + ellipse.countSquare());

        circle.view();
        ellipse.view();
    }
 }


