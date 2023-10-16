package org.example.problem1;

public class EcoSystemMain {
    public static void main(String[] args) {
        Conditions conditions = Conditions.getInstance();
        EcoSystem ecosystem = new EcoSystem();
        ecosystem.runSimulation(conditions);
        ecosystem.printAnimalToSpawn();
    }
}
