package labs_examples.objects_classes_methods.labs.oop.A_inheritance.nutritions;

public class Proteins extends Macros{
    private String aminoProfile;
    private String source;

    public Proteins(String aminoProfile, String source) {
        this.aminoProfile = aminoProfile;
        this.source = source;
    }

    public Proteins(String name, double caloriesPerGramm, String type, double protein, double fats, double carbs, String aminoProfile, String source) {
        super(name, caloriesPerGramm, type, protein, fats, carbs);
        this.aminoProfile = aminoProfile;
        this.source = source;
    }

    public String getAminoProfile() {
        return aminoProfile;
    }

    public void setAminoProfile(String aminoProfile) {
        this.aminoProfile = aminoProfile;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Proteins{" +
                "aminoProfile='" + aminoProfile + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
