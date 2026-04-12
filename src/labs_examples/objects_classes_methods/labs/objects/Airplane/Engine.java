package labs_examples.objects_classes_methods.labs.objects.Airplane;

public class Engine {
    private double enginePower;
    private int speed;

    public Engine(double enginePower, int speed) {
        this.enginePower = enginePower;
        this.speed = speed;
    }

    public Engine() {
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", speed=" + speed +
                '}';
    }
}
