package org.example.problem1.factoryPattern;

import java.util.HashMap;
import java.util.Map.Entry;

public class EcoSystem {
    public static final int iterationLimit = 20;

    public static void main(String[] args) {
        HashMap<String, Integer> conditions = new HashMap<>();
        conditions.put("DOG",5);
        conditions.put("CAT",8);
        conditions.put("RABBIT",10);
        conditions.put("DUCK",12);
        conditions.put("WOLF",15);

        spawn(conditions);
    }

    public static void spawn(HashMap<String, Integer> conditions) {
        for (int i = 1; i <= iterationLimit; i++) {
            for (Entry<String, Integer> condition : conditions.entrySet()) {
                if(i%condition.getValue() == 0){
                    AnimalFactory.getAnimalFactory().getAnimal(condition.getKey()).spawn();
                }
            }
        }
    }
}
