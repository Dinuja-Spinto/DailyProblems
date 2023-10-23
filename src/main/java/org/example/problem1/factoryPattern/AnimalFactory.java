package org.example.problem1.factoryPattern;

import java.util.ArrayList;

public class AnimalFactory {

    private static AnimalFactory animalFactory;

    private AnimalFactory(){}

    public static AnimalFactory getAnimalFactory() {
        return (animalFactory==null)? animalFactory = new AnimalFactory() : animalFactory;
    }

    public Animal getAnimal(String animal){
        switch (animal) {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            case "RABBIT":
                return new Rabbit();
            case "DUCK":
                return new Duck();
            case "WOLF":
                return new Wolf();
            default:
                return null;
        }
    }
}
