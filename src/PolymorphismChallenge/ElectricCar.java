package PolymorphismChallenge;

public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public void startEngine() {
        System.out.println("Powering up electric motor...");
    }

    protected void runEngine() {
        System.out.println("Electric motor running. Range: " + this.avgKmPerCharge + " km per charge, battery: " + this.batterySize + " kWh");
    }
}
