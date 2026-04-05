package PolymorphismChallenge;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, int cylinders, int batterySize, double avgKmPerLitre) {
        super(description);
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void startEngine() {
        System.out.println("Starting hybrid system...");
    }

    protected void runEngine() {
        System.out.println("Hybrid engine running with " + this.cylinders + " cylinders, battery " + this.batterySize + " kWh, fuel usage " + this.avgKmPerLitre + " km/l");
    }
}
