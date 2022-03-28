package com.company;

public class DieselCar extends AFuelCar
{
    protected boolean hasParticleFilter;
    public DieselCar(int kmPrLitre,String make, String model, String registrationNumber, int numberOfDoors, boolean hasParticleFilter) {
        super(kmPrLitre,make,model,registrationNumber,numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrLitre() {
        return super.getKmPrLitre();
    }


    String getFuelType() {
        return null;
    }


    public int getRegistrationFee() {
        int sum = 0;

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            sum = 330+130;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            sum = 1050+1390;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            sum = 2340+1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            sum =  5500+2770;
        } else if (kmPrLitre <= 5) {
            sum = 10470+15260;
        }
        if(!hasParticleFilter){
            return sum + 1000;
        }else {
            return sum;
        }
    }

    @Override
    public String toString() {
        return "DieselCar: " +
                "make= '" + make + '\'' +
                ", Model= '" + Model + '\'' +
                ", registrationNumber= '" + registrationNumber + '\'' +
                ", numberOfDoors= " + numberOfDoors +
                ", kmPrLitre= " + kmPrLitre +
                ", hasParticleFilter= " + hasParticleFilter;
    }
}


