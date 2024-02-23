package task5;

public class Engine {

    private boolean isStarted;

    public void start() {
        if (!isStarted) {
            isStarted = true;
        }
    }

    public void stop() {
        if (isStarted) {
            isStarted = false;
        }
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        this.isStarted = started;
    }
}
