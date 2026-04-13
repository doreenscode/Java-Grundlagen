package labs_examples.objects_classes_methods.labs.oop.A_inheritance.nutritions;

import javax.xml.transform.Source;

public class NutrientController {
    static void main(String[] args) {
        Carbs reis = new Carbs("Reis", 349,"carb", 7.2,2.2,74.1,8,true);
        Proteins hühnerei = new Proteins("Hühnerei",155, "protein",26,14.1, 13,"vollwertig","tierisch");
        Vitamins b12 = new Vitamins("B12",0,"Vitamine", true, 12);

        System.out.println("Reis: " + reis.toString());
        System.out.println("Hühnerei: " + hühnerei.toString());
        System.out.println("B12: " + b12.toString());

    }
}
