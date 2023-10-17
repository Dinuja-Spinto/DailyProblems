package org.example.problem1.factoryPattern;

import java.util.ArrayList;

public class EcoSystem {
    public static final int iterationLimit =20;
    public static void main(String[] args) {

        SpawnFactory spawnFactory = new SpawnFactory();

        for (int i = 0; i < iterationLimit; i++ ){
            ArrayList<Animal> spawns = spawnFactory.getSpawn(i);

            for (Animal animal : spawns){
                animal.spawn();
            }
        }

    }
}
