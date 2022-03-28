package com.company;

import com.company.ACar;

public abstract class AFuelCar extends ACar
{
    protected int kmPrLitre;

    abstract String getFuelType(); // should return “Gasoline” or “Diesel”

    int kmPrLitre() // should return how many kilometres the car can drive on 1 litre of fuel
    {
        return 0;
    }

    public AFuelCar(int kmPrLitre, String make, String model, String registrationNumber, int numberOfDoors) {
        super(make,model,registrationNumber,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

}
