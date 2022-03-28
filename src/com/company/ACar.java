package com.company;

public abstract class ACar implements Car
{
String make;
String Model;

String registrationNumber;

/*final*/ int numberOfDoors;

    /*  protected ACar() {
        numberOfDoors = getNumberOfDoors();
    }  */

    public ACar(String make, String model, String registrationNumber, int numberOfDoors) {
        this.make = make;
        Model = model;
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return Model;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
