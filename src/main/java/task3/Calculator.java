package task3;

public class Calculator {
    public Calculator() {
    }

    public Number getResultFor(char sign, Number valueA, Number valueB) {
        Number result;
        if (sign == '+') {
            result = this.summing.calculate(valueA, valueB);
        } else if (sign == '-') {
            result = this.subtraction.calculate(valueA, valueB);
        } else if (sign == '*') {
            result = this.multiplication.calculate(valueA, valueB);
        } else if (sign == '/') {
            result = this.division.calculate(valueA, valueB);
        } else {
            throw new IllegalArgumentException("Wrong operator: " + sign);
        }
        return result;
    }

    private Computable<Number> summing = (valA, valB) -> (valA.doubleValue() + valB.doubleValue());
    private Computable<Number> subtraction = (valA, valB) -> valA.doubleValue() - valB.doubleValue();
    private Computable<Number> division = (valA, valB) -> valA.doubleValue() / valB.doubleValue();
    private Computable<Number> multiplication = (valA, valB) -> valA.doubleValue() * valB.doubleValue();
}