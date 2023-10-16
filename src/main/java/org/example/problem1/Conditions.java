package org.example.problem1;

import java.io.IOException;
import java.util.Properties;

public class Conditions {

    private int iterationLimit;
    private int divisibleOfDog;
    private int divisibleOfCat;
    private int divisibleOfWolf;
    private int divisibleOfRabbit;
    private int divisibleOfDuck;
    private static final Conditions conditionInstance = initConditions();

    private Conditions(int iterationLimit, int divisibleOfDog, int divisibleOfCat, int divisibleOfWolf, int divisibleOfRabbit, int divisibleOfDuck) {
        this.iterationLimit = iterationLimit;
        this.divisibleOfDog = divisibleOfDog;
        this.divisibleOfCat = divisibleOfCat;
        this.divisibleOfWolf = divisibleOfWolf;
        this.divisibleOfRabbit = divisibleOfRabbit;
        this.divisibleOfDuck = divisibleOfDuck;
    }

    private static Conditions initConditions() {
        Properties properties = new Properties();
        Conditions conditions;
        try {
            properties.load(Conditions.class.getResourceAsStream("/problem1.properties"));
            conditions = new Conditions(
                    Integer.parseInt(properties.getProperty("iterationLimit")),
                    Integer.parseInt(properties.getProperty("divisibleOfDog")),
                    Integer.parseInt(properties.getProperty("divisibleOfCat")),
                    Integer.parseInt(properties.getProperty("divisibleOfWolf")),
                    Integer.parseInt(properties.getProperty("divisibleOfRabbit")),
                    Integer.parseInt(properties.getProperty("divisibleOfDuck"))
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return conditions;
    }

    public static Conditions getInstance(){
        return conditionInstance;
    }

    public int getIterationLimit() {
        return iterationLimit;
    }

    public void setIterationLimit(int iterationLimit) {
        this.iterationLimit = iterationLimit;
    }

    public int getDivisibleOfDog() {
        return divisibleOfDog;
    }

    public void setDivisibleOfDog(int divisibleOfDog) {
        this.divisibleOfDog = divisibleOfDog;
    }

    public int getDivisibleOfCat() {
        return divisibleOfCat;
    }

    public void setDivisibleOfCat(int divisibleOfCat) {
        this.divisibleOfCat = divisibleOfCat;
    }

    public int getDivisibleOfWolf() {
        return divisibleOfWolf;
    }

    public void setDivisibleOfWolf(int divisibleOfWolf) {
        this.divisibleOfWolf = divisibleOfWolf;
    }

    public int getDivisibleOfRabbit() {
        return divisibleOfRabbit;
    }

    public void setDivisibleOfRabbit(int divisibleOfRabbit) {
        this.divisibleOfRabbit = divisibleOfRabbit;
    }

    public int getDivisibleOfDuck() {
        return divisibleOfDuck;
    }

    public void setDivisibleOfDuck(int divisibleOfDuck) {
        this.divisibleOfDuck = divisibleOfDuck;
    }
}
