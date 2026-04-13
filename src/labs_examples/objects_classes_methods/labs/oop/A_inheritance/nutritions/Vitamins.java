package labs_examples.objects_classes_methods.labs.oop.A_inheritance.nutritions;

public class Vitamins extends Nutrients {
    private boolean isWaterSoluble;
    private double dailyDose;

    public Vitamins(boolean isWaterSoluble, double dailyDose) {
        this.isWaterSoluble = isWaterSoluble;
        this.dailyDose = dailyDose;
    }

    public Vitamins(String name, double caloriesPerGramm, String type, boolean isWaterSoluble, double dailyDose) {
        super(name, caloriesPerGramm, type);
        this.isWaterSoluble = isWaterSoluble;
        this.dailyDose = dailyDose;
    }

    public boolean isWaterSoluble() {
        return isWaterSoluble;
    }

    public void setWaterSoluble(boolean waterSoluble) {
        isWaterSoluble = waterSoluble;
    }

    public double getDailyDose() {
        return dailyDose;
    }

    public void setDailyDose(double dailyDose) {
        this.dailyDose = dailyDose;
    }

    @Override
    public String toString() {
        return "Vitamins{" +
                "isWaterSoluble=" + isWaterSoluble +
                ", dailyDose=" + dailyDose +
                '}';
    }
}