package com.hz;

import java.util.HashMap;

public class Bus extends HashMap<String, Passenger> {

    public void getIn(Passenger passenger){
        this.put(passenger.getName(), passenger);
    }
}
