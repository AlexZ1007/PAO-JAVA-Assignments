package Lab7.Calculator;

import Lab7.Calculator.Exceptii.*;

import java.io.*;
import java.util.*;

public class DoubleCalculator implements Calculator {
    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null)
            throw new NullParameterException("Parametrii nu pot fi null");

        double result = a + b;
        if (result == Double.POSITIVE_INFINITY)
            throw new OverflowException("Overflow: suma este infinit pozitiv");
        if (result == Double.NEGATIVE_INFINITY)
            throw new UnderflowException("Underflow: suma este infinit negativ");

        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null)
            throw new NullParameterException("Parametrii nu pot fi null");

        if (b == 0)
            throw new MyArithmeticException("Impartirea la 0 nu este permisa");

        return a / b;
    }

    @Override
    public double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, EmptyVectorException {
        if (values == null)
            throw new NullParameterException("Vectorul nu poate fi null");

        if (values.length == 0)
            throw new EmptyVectorException("Vectorul este gol. Nu se poate calcula media.");

        Double sum = 0.0;
        for (Double val : values) {
            sum = add(sum, val);
        }

        return divide(sum, (double) values.length);
    }

    public static Double[] readDoublesFromFile(String filePath) throws MyFileException {
        List<Double> values = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                values.add(Double.parseDouble(line));
            }
        } catch (IOException | NumberFormatException e) {
            throw new MyFileException("Eroare la citirea din fisier: " + e.getMessage());
        }

        return values.toArray(new Double[0]);
    }

}
