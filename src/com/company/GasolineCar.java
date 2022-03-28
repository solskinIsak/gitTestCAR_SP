package com.company;

public class GasolineCar extends AFuelCar
{


    public GasolineCar(int kmPrLitre,String make, String model, String registrationNumber, int numberOfDoors) {
        super(kmPrLitre,make,model,registrationNumber,numberOfDoors);
    }

    public int getKmPrLitre() {
        return super.getKmPrLitre();
    }


     String getFuelType() {
        return null;
    }


    public int getRegistrationFee() {
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return 5500;
        } else if (kmPrLitre <= 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "GasolineCar: " +
                "make= '" + make + '\'' +
                ", Model= '" + Model + '\'' +
                ", registrationNumber= '" + registrationNumber + '\'' +
                ", numberOfDoors= " + numberOfDoors +
                ", kmPrLitre= " + kmPrLitre;
    }
}
