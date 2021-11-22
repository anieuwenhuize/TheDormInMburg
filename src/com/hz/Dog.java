package com.hz;

public class Dog implements Passenger {
    @Override
    public String getName() {
        return "Woody";
    }

    @Override
    public Ticket getTicket() {
        return null;
    }
}
