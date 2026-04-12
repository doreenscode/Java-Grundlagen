package labs_examples.objects_classes_methods.labs.objects.Airplane;

public class AirplainController {
    static void main(String[] args) {
        Cockpit cockpit = new Cockpit("Panasonic", "P340");
        Engine engine = new Engine(25.000, 850);
        Kitchen kitchen = new Kitchen("Bosch", "Exellent5000", "Stainless steel");
        Passenger passenger = new Passenger(123L, "Franz", "Müller", 58);

        Airplane airplane = new Airplane("Boing", 5000, 3500, 300, cockpit, engine, kitchen, passenger);

        System.out.println(airplane.toString());

    }


}
