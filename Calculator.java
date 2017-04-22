
public class Calculator {
    public static Double calculate(Double op1, Double op2, DoubleOperator operator) {
        return operator.apply(op1, op2); //delegate to the operator
    }
    
    @FunctionalInterface
    public interface DoubleOperator {
        public Double apply(Double a, Double b);
    }
}

