package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
    Car gCar = new GasPoweredCar("Aston Martin", (double)30.0F, 8);
    gCar.drive();
    gCar.startEngine();
    Car eCar = new ElectricCar("Porsche Taycan", (double)200.0F, 1500);
    eCar.drive();
    eCar.startEngine();
    Car hCar = new HybridCar("Hyundai", 8, 1500, (double)60.0F);
    hCar.drive();
    hCar.startEngine();
    }
}
