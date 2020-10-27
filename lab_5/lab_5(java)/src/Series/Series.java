package Series;

public abstract class Series {
    protected double first;
    protected double step;
    protected int size;

    public Series(double first, double step, int size) {
        this.first = first;
        this.step = step;
        this.size = size;
    }

    public Series() {
        this(1, 2, 5);
    }

    public double getElement(int index) {
        double element = this.first * index;
        return element;
    }

    public double getSum() {
        double last = (this.first + (this.size - 1) * this.step);
        return (this.first + last) / 2 * this.size;
    }

    public void getInfo() {
        System.out.println(this.getElement(4));
        System.out.println(this.getSum());
    }
}
