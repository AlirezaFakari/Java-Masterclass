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
    @Override
    public void startEngine(){
        System.out.println("Starting hybrid system...");
    }
    @Override
    protected void runEngine(){
        System.out.println("Hybrid engine running with " + cylinders +
                " cylinders, battery " + batterySize +
                " kWh, fuel usage " + avgKmPerLitre + " km/l");
    }
}
