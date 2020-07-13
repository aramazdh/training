package com.training;


import com.training.transport.Bicycle;
import com.training.transport.Car;
import com.training.transport.Transport;
import com.training.transport.Truck;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Bicycle suzuki = new Bicycle();
        Car nissan = new Car(Engine.PETROL, Fuel.PETROL, 4, 4);
        Car tesla = new Car(Engine.ELECTRIC, 4, 4);
        Truck truck = new Truck(Engine.PETROL, Fuel.PETROL, 4);

        List<Transport> cars = new LinkedList<>();
        cars.add(suzuki);
        cars.add(nissan);
        cars.add(tesla);
        cars.add(truck);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }



    }
}
