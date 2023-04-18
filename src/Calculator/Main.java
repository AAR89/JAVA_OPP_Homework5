package Calculator;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CalculateComplex calculateComplex = new CalculateComplex(15, 37);
        calculateComplex.setW(2.0);
        calculateComplex.setZ(3.3);
        System.out.println("sum = " + calculateComplex.sum());
        System.out.println("diff = " + calculateComplex.diff());
        System.out.println("multi = " + calculateComplex.multi());
        double resulty = calculateComplex.div().getY();
        Double resultx = calculateComplex.div().getX();
        String formattedDoublex = new DecimalFormat("#0.00").format(resulty);
        String formattedDoubley = new DecimalFormat("#0.00").format(resultx);

        System.out.printf("div= " + formattedDoublex + " " + formattedDoubley);

    }
}