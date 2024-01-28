package task3;

public interface MathOperations<T extends Number> {

    T calculate(T val1, T val2);
}
