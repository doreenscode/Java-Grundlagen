package labs_examples.objects_classes_methods.labs.objects.Airplane;

public class Airplane {

    private String manufacturer;
    private double fuelCapacity;
    private double currentFuelLevel;
    private int seats;

    Cockpit cockpit;
    Engine engine;
    Kitchen kitchen;
    Passenger passenger;

    public Airplane() {
    }

    public Airplane(String manufacturer, double fuelCapacity, double currentFuelLevel, int seats, Cockpit cockpit, Engine engine, Kitchen kitchen, Passenger passenger) {
        this.manufacturer = manufacturer;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.seats = seats;
        this.cockpit = cockpit;
        this.engine = engine;
        this.kitchen = kitchen;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", seats=" + seats +
                ", cockpit=" + cockpit +
                ", engine=" + engine +
                ", kitchen=" + kitchen +
                ", passenger=" + passenger +
                '}';
    }
}


