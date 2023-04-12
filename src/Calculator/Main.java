package Calculator;

public class Main {
    public static void main(String[] args) {
        CalculateComplex calculateComplex = new CalculateComplex(15, 37);
        calculateComplex.setW(2.0);
        calculateComplex.setZ(3.3);
        System.out.println("sum = " + calculateComplex.sum());
        System.out.println("diff = " + calculateComplex.diff());
        System.out.println("multi = " + calculateComplex.multi());
        System.out.printf("div= " + calculateComplex.div());

    }
}