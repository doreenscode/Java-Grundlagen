package labs_examples.objects_classes_methods.labs.objects.Airplane;

public class Cockpit {
    private String manufacturer;
    private String model;

    public Cockpit() {
    }

    public Cockpit(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
