package com.training.transport;


import com.training.Engine;
import com.training.Fuel;
import com.training.interfaces.FuelVehicle;
import com.training.interfaces.Sunroof;

public class Car extends Transport implements Sunroof, FuelVehicle {


    public Car(Engine engine, Fuel fuel, int tires, int doors) {
        this.tires = tires;
        this.engine = engine;
        this.doors = doors;
        if (engine == Engine.PETROL) {
            this.fuel = fuel;
        }
    }

    public Car(Engine engine, int tires, int doors) {
        this(engine, null, tires, doors);
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

    @Override
    public void openSunroof() {
    }

    @Override
    public void closeSunroof() {

    }
}
