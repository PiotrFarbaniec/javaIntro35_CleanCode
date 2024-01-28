package task3;

public class Calculator {
    public Calculator() {
    }

    static Number getResultFor(char sign, Number valueA, Number valueB) {
        Number result;
        if (sign == '+') {
            result = new Calculator().summing.calculate(valueA, valueB);
        } else if (sign == '-') {
            result = new Calculator().subtraction.calculate(valueA, valueB);
        } else if (sign == '*') {
            result = new Calculator().multiplication.calculate(valueA, valueB);
        } else if (sign == '/') {
            result = new Calculator().division.calculate(valueA, valueB);
        } else {
            throw new IllegalArgumentException("Wrong operator: " + sign);
        }
        return result;
    }

    MathOperations<Number> summing = (valA, valB) -> (valA.doubleValue() + valB.doubleValue());
    MathOperations<Number> subtraction = (valA, valB) -> valA.doubleValue() - valB.doubleValue();
    MathOperations<Number> division = (valA, valB) -> valA.doubleValue() / valB.doubleValue();
    MathOperations<Number> multiplication = (valA, valB) -> valA.doubleValue() * valB.doubleValue();
}