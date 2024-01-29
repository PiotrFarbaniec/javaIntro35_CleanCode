package task3;

public class Task3 {

    static int value1 = 10;
    static double value2 = 15.5d;
    static Calculator cl = new Calculator();
    public static void main(String[] args) {
        System.out.println(cl.getResultFor('+', value1, value2));
        System.out.println(cl.getResultFor('-', value1, value2));
        System.out.println(cl.getResultFor('/', value2, value1));
    }
}
