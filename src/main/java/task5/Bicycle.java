package task5;

public class Bicycle extends Vehicle {

    @Override
    protected void startEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }

    @Override
    protected void stopEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }
}

