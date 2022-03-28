package com.company;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet;

    public FleetOfCars()
    {
        fleet = new ArrayList<Car>();
    }
    protected void addCar(Car car) {
        fleet.add(car);
    }


    protected int getTotalRegistrationFeeForFleet() {
        int fee = 0;
        for (int i = 0; i < fleet.size(); i++) {
            fee += fleet.get(i).getRegistrationFee();
        }
        return fee;
    }

    @Override
    public String toString() {
        return "FleetOfCars: " +
                "fleet=" + fleet +
                '}';
    }
}
