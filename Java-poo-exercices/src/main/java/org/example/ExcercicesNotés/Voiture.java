package org.example.ExcercicesNotés;

public class Voiture {
    private int price;
    private String brand;
    private int mileage;
    private MotorType motorType;

    public Voiture(int price, String brand, int mileage, MotorType motorType) {
        this.price = price;
        this.brand = brand;
        this.mileage = mileage;
        this.motorType = motorType;
    }

    public void displayInfo() {
        System.out.println("Voiture de la marque: " + brand);
        System.out.println("Au prix de " + price);
        switch (motorType) {
            case Hybrid -> System.out.println("Avec un moteur hibride");
            case Electric -> System.out.println("Avec un moteur électrique");
            case Gasoline -> System.out.println("Avec un moteur à essence");
        }
        System.out.println("Et un kilométrage de " + mileage);
    }
}
