package com.training.transport;


import com.training.Engine;

public class Bicycle extends Transport {

    public Bicycle() {
        this.tires = 2;
        this.engine = Engine.MECHNICAL;
        this.doors = 0;
    }


    @Override
    void drive() {
        isActive = true;
        speed = 5;
    }

    @Override
    public void setDoors(int doors) throws Exception {
        throw new Exception("Doors of bycycle can not change");
    }
}
