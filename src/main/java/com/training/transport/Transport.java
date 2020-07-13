package com.training.transport;


import com.training.Engine;
import com.training.Fuel;

public abstract class Transport {
    int tires;
    Engine engine;
    int doors;
    boolean isActive;
    int speed;
    Fuel fuel = null;

    abstract void drive();

    void speedup(int speedup) {
        speed += speedup;
    }

    void brake(int speedup) {
        speed -= speedup;
    }

    void stop() {
        isActive = false;
        System.out.println("Transport stopped");
    }

    //////////////////////////////////////////////////
    /////////////////GETTERS AND SETTERS//////////////
    //////////////////////////////////////////////////
    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) throws Exception {
        this.doors = doors;
    }
}
