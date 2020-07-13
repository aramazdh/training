package com.training.transport;


import com.training.Engine;
import com.training.Fuel;
import com.training.interfaces.FuelVehicle;

public class Truck extends Transport implements FuelVehicle {

    public Truck(Engine engine, Fuel fuel, int tires) {
        this.tires = tires;
        this.doors = 2;
        if (engine == Engine.PETROL) {
            setFuel(fuel);
        }
    }

    @Override
    void drive() {
        isActive = true;
        speed = 15;
    }

    @Override
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}
