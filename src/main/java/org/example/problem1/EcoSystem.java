package org.example.problem1;

import java.util.ArrayList;

public class EcoSystem {
    private ArrayList<Animal> animals = new ArrayList<>();

    public EcoSystem() {

    }

    public void runSimulation(Conditions conditions) {
        for (int i = 1; i <= conditions.getIterationLimit(); i++) {
            if (i % conditions.getDivisibleOfDog() == 0) {
                animals.add(new Dog());
            }
            if (i % conditions.getDivisibleOfCat() == 0) {
                animals.add(new Cat());
            }
            if (i % conditions.getDivisibleOfWolf() == 0) {
                animals.add(new Wolf());
            }
            if (i % conditions.getDivisibleOfRabbit() == 0) {
                animals.add(new Rabbit());
            }
            if (i % conditions.getDivisibleOfDuck() == 0) {
                animals.add(new Duck());
            }
        }
    }

    public void printAnimalToSpawn() {
        for (Animal animal : animals) {
            System.out.println("Spawn a " + animal.getName());
        }
    }
}
