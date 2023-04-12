package Calculator;

public class ComplexNumbers extends ValuesNumber {
    public ComplexNumbers(double x, double y) {
        super.x = x;
        super.y = y;
    }

    public ComplexNumbers() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumbers compNum = (ComplexNumbers) obj;
        return super.x == compNum.x && super.y == compNum.y;
    }

    @Override
    public String toString() {
        return '{' +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
