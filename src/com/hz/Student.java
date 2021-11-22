package com.hz;

public class Student implements Passenger {

    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Ticket getTicket() {
        return null;
    }
}
