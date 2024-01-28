package task5;

public class Car extends Vehicle {

    @Override
    protected void startEngine() {
        super.startEngine();
    }

    @Override
    protected void stopEngine() {
        super.stopEngine();
    }

    @Override
    public boolean isEngineStarted() {
        return super.isEngineStarted();
    }

    @Override
    public void setEngineStarted(boolean engineStarted) {
        super.setEngineStarted(engineStarted);
    }
}
