package com.hz;

public class Bed {

    private Student sleeper;

    public Student getSleeper() {
        return sleeper;
    }

    public void setSleeper(Student sleeper) {
        this.sleeper = sleeper;
    }

    public boolean hasSleeper() {
        return this.sleeper != null;
    }
}
