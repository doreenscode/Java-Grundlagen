package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.models;

import static java.lang.Math.pow;

public class Cat extends Pet implements WhatPetsCanDo {

    public Cat() {
    }

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return getName() + " frist gern Fisch";
    }

    @Override
    public double metabolicWight() {
        return pow(getWeight(), 0.67);
    }

}
