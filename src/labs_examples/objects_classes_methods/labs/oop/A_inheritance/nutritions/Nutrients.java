package labs_examples.objects_classes_methods.labs.oop.A_inheritance.nutritions;

public class Nutrients {
    private String name;
    private double caloriesPerGramm;
    private String Type;

    public Nutrients() {
    }

    public Nutrients(String name, double caloriesPerGramm, String type) {
        this.name = name;
        this.caloriesPerGramm = caloriesPerGramm;
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCaloriesPerGramm() {
        return caloriesPerGramm;
    }

    public void setCaloriesPerGramm(int caloriesPerGramm) {
        this.caloriesPerGramm = caloriesPerGramm;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Nutrients{" +
                "name='" + name + '\'' +
                ", caloriesPerGramm=" + caloriesPerGramm +
                ", Type='" + Type + '\'' +
                '}';
    }
}
