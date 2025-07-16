package com.example.Low.Level.design.factory.solution;

import com.example.Low.Level.design.factory.problem.Bike;
import com.example.Low.Level.design.factory.problem.Bus;
import com.example.Low.Level.design.factory.problem.Car;
import com.example.Low.Level.design.factory.problem.Transport;

public class Transportfactory {

    public static Transport getTransport(String transport) {
        if(transport.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        else if(transport.equalsIgnoreCase("bus")) {
            return new Bus();
        }
        else if(transport.equalsIgnoreCase("car")) {
            return new Car();
        }
        return null;
    }
}
