package labs_examples.objects_classes_methods.labs.oop.A_inheritance.nutritions;

public class Carbs extends Macros {
    private double glycemicIndex;
    private boolean isComplex;

    public Carbs() {
    }

    public Carbs(String name, double caloriesPerGramm, String type, double protein, double fats, double carbs, double glycemicIndex, boolean isComplex) {
        super(name, caloriesPerGramm, type, protein, fats, carbs);
        this.glycemicIndex = glycemicIndex;
        this.isComplex = isComplex;
    }

    public double getGlycemicIndex() {
        return glycemicIndex;
    }

    public void setGlycemicIndex(double glycemicIndex) {
        this.glycemicIndex = glycemicIndex;
    }

    public boolean isComplex() {
        return isComplex;
    }

    public void setComplex(boolean complex) {
        isComplex = complex;
    }


    @Override
    public String toString() {
        return "Carbs{" +
                "glycemicIndex=" + glycemicIndex +
                ", isComplex=" + isComplex +
                '}';
    }
}
