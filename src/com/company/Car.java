package com.company;

public interface Car
{
    String getRegistrationNumber(); // number on the number plate

    String getMake(); //the make of the car, volvo, audi etc.

    String getModel(); //the model of the car s70, v70, 850, a4 etc

    int getNumberOfDoors(); // the number of doors (including trunk)

    int getRegistrationFee(); // calculates registration fee for the car
}
