package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.controller;

import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.models.Cat;
import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.models.Dog;

public class PetController {

    static void main(String[] args) {

    Dog zoe = new Dog("Zoe", 6, 24);
    Cat lucy = new Cat("Lucy", 10, 5);
    Cat timmy = new Cat();

        System.out.println(zoe.eat());
        System.out.println(lucy.eat());
        System.out.println(zoe.toString());
        System.out.println(lucy.toString());
        System.out.println(timmy.toString());

        System.out.println(zoe.metabolicWight());
        System.out.println(lucy.metabolicWight());
    }

}
