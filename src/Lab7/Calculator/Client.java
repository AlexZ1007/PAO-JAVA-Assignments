package Lab7.Calculator;

public class Client {
    public static void main(String[] args) {
        DoubleCalculator calc = new DoubleCalculator();

        try {
            calc.add(null, 2.0);
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            calc.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            calc.divide(10.0, 0.0);
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            calc.average(null);
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            calc.average(new Double[]{});
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            Double[] values = DoubleCalculator.readDoublesFromFile("inexistent.txt");
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            Double[] values = DoubleCalculator.readDoublesFromFile("src/Lab7/Calculator/input.txt");
            double avg = calc.average(values);
            System.out.println("Media valorilor din fisier este: " + avg);
            System.out.println(calc.add(2.0, 5.31));
            System.out.println(calc.divide(5.14, 2.141));
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }
    }
}
