package task3;

public interface Computable<T extends Number> {

    T calculate(T val1, T val2);
}
