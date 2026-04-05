package PolymorphismChallenge;

import java.io.PrintStream;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine starting...");
    }

    public void drive() {
        PrintStream var10000 = System.out;
        String var10001 = this.getClass().getSimpleName();
        var10000.println("Driving " + var10001 + "\n" + this.description);
        this.runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine running...");
    }
}
