package PolymorphismChallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine starting...");
    }

    public void drive(){
        System.out.println("Driving " + getClass().getSimpleName() + "\n" + description);
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine running...");
    }
}
