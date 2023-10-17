package org.example.problem1.factoryPattern;

import java.util.ArrayList;

public class SpawnFactory {

    private static final int divisibleOfDog=5;
    private static final int divisibleOfCat=8;
    private static final int divisibleOfWolf=10;
    private static final int divisibleOfRabbit=12;
    private static final int divisibleOfDuck=15;

    public ArrayList<Animal> getSpawn(int no){
        ArrayList<Animal> spawns = new ArrayList<>();
        if(no % divisibleOfDog == 0){
            spawns.add(new Dog());
        }
        if(no % divisibleOfCat == 0){
            spawns.add(new Cat());
        }
        if(no % divisibleOfWolf == 0){
            spawns.add(new Wolf());
        }
        if(no % divisibleOfRabbit == 0){
            spawns.add(new Rabbit());
        }
        if(no % divisibleOfDuck == 0){
            spawns.add(new Duck());
        }
        return spawns;
    }
}
