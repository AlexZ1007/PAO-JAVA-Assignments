package Lab7.Calculator;

import Lab7.Calculator.Exceptii.*;

public interface Calculator {
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double divide(Double a, Double b) throws NullParameterException, MyArithmeticException;
    double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, EmptyVectorException;
}
