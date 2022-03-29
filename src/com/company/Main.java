package com.company;

public class Main {

    public static void main(String[] args)
    {
        NewFeature newfeet = new NewFeature();
        MainFeature mainfeet = new MainFeature();

        // write your code here
        System.out.println(mainfeet);
        System.out.println(newfeet);

        FleetOfCars fleet = new FleetOfCars();
        Car gacar = new GasolineCar(20,"voller","850","1337",4);
        Car dacar = new DieselCar(100,"ford","raptor","redneck",2,false);
        Car ecar = new ElectricCar(75,380,"MuskMACHINE","Teeeeeweeeeeeeeesla","lul",5);
        //System.out.println(gacar);
        //System.out.println(dacar);
      //  System.out.println(ecar);


        fleet.addCar(gacar);
        fleet.addCar(dacar);
        fleet.addCar(ecar);
        //System.out.println("the total reg fee is: "+ fleet.getTotalRegistrationFeeForFleet());
    }


}
