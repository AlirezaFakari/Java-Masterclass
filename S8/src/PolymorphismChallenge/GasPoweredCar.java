package PolymorphismChallenge;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine(){
        System.out.println("Starting gas engine with " + cylinders + " cylinders...");
    }
    @Override
    protected void runEngine(){
        System.out.println("Gas engine running. Usage: " + avgKmPerLitre + " km/l");
    }
}
