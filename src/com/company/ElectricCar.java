package com.company;

public class ElectricCar extends ACar {

    int batteryCapacity;
    int maxRange;



    public int getBatteryCapacityKWh() //reutrns the battery capacity in kilowatt hours
    {
        return batteryCapacity;
    }
    public int getMaxRangeKm() // returns the  maximum range in kilometers
    {
        return maxRange;
    }
    protected int getWhPrKm() // returns the power comsumption in watt hours per driven kilometer.
    {
        return (getBatteryCapacityKWh() * 1000)/maxRange;
    }

    public ElectricCar(int batteryCapacity, int maxRange,String make, String model, String registrationNumber, int numberOfDoors)
    {
        super(make,model,registrationNumber,numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getRegistrationFee()
    {


        int phantomWhprKm = 100/(getWhPrKm()/91);
        System.out.println(phantomWhprKm);
        if(phantomWhprKm<=50 && phantomWhprKm>=20){
            return 330;
        }
        if(phantomWhprKm<=20 && phantomWhprKm>=15){
            return 1050;
        }
        if(phantomWhprKm<=15 && phantomWhprKm>=10){
            return 2340;
        }
        if(phantomWhprKm<=10 && phantomWhprKm>=5){
            return 5500;
        }
        if(phantomWhprKm<5){
            return 10470;
        }
        return 0;
    }
        /*int i = 404;
        int phantomWhprKm = 100/getWhPrKm()/91;

        System.out.println(phantomWhprKm);

        if (phantomWhprKm >= 20 && phantomWhprKm <= 50) {
            i = 330;
        } else if (phantomWhprKm >= 15 && phantomWhprKm <= 20) {
            i =  1050;
        } else if (phantomWhprKm >= 10 && phantomWhprKm <= 14) {
            i =  2340;
        } else if (phantomWhprKm >= 5 && phantomWhprKm <= 9) {
            i = 5500;
        } else if (phantomWhprKm <= 5) {
            i = 10470;
        }
        return i; */


    @Override
    public String toString() {
        return "ElectricCar: " +
                "Maker= '" + make + '\'' +
                ", Car Model= '" + Model + '\'' +
                ", the registrationNumber= '" + registrationNumber + '\'' +
                ", the numberOfDoors= " + numberOfDoors +
                ", the maxRange= " + maxRange +
                ", the BatteryCapacity= " +batteryCapacity;
    }
}
