package Series;

public class AriProg extends Series{
    public AriProg(double first, double step, int size) {
        super(first, step, size);
    }

    public AriProg() {
        super(1, 2, 5);
    }

    @Override
    public double getElement(int index) {
        double element = this.first + (index-1) * this.step;
        return element;
    }

    @Override
    public double getSum() {
        double last = (this.first + (this.size - 1) * this.step);
        return (this.first + last) / 2 * this.size;
    }
}
