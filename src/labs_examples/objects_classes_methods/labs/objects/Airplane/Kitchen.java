package labs_examples.objects_classes_methods.labs.objects.Airplane;

public class Kitchen {
    private String manufacturer;
    private String model;
    private String material;

    public Kitchen() {
    }
    public Kitchen(String manufacturer, String model, String material) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.material = material;

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
