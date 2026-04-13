package labs_examples.objects_classes_methods.labs.oop.A_inheritance.nutritions;

public class Macros extends Nutrients {
    private double protein;
    private double fats;
    private double carbs;

    public Macros() {
    }

    public Macros(double protein, double fats, double carbs) {
        this.protein = protein;
        this.fats = fats;
        this.carbs = carbs;
    }

    public Macros(String name, double caloriesPerGramm, String type, double protein, double fats, double carbs) {
        super(name, caloriesPerGramm, type);
        this.protein = protein;
        this.fats = fats;
        this.carbs = carbs;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    @Override
    public String toString() {
        return "\"Protein: \" + getProtein() + \"fats: \" + getFats() + \"carbs: \" + getCarbs()";
    }

}
