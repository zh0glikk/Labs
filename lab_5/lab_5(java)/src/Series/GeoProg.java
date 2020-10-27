package Series;

public class GeoProg extends Series{
    public GeoProg(double first, double step, int size) {
        super(first, step, size);
    }

    public GeoProg() {
        super(1, 2, 5);
    }

    @Override
    public double getElement(int index) {
        double element = this.first * Math.pow(this.step, index-1);
        return element;
    }

    @Override
    public double getSum() {
        return this.first * ( 1 - Math.pow(this.step, this.size) / (1 - this.step));
    }
}
