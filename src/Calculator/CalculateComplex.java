package Calculator;

public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {
    public CalculateComplex(double x, double y) {
        super(x, y);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((x + w), (y + z));
    }

    @Override
    public ComplexNumbers diff() {
        return new ComplexNumbers((x - w), (y - z));
    }

    @Override
    public ComplexNumbers multi() {
        return new ComplexNumbers((x * w - y * z), (x * z + y * w));
    }

    @Override
    public ComplexNumbers div() {
        ComplexNumbers temp = new ComplexNumbers();
        double r = (w * w) + (z * z);
        temp.x = ((x * w) + (y * z)) / r;
        temp.y = (y * w - x * z) / r;
        return temp;
    }
}
