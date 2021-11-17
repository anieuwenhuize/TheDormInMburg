package com.hz;

public class Couch {

    private Student chillerLeft;
    private Student chillerRight;


    public Student getChillerLeft() {
        return chillerLeft;
    }

    public Student getChillerRight() {
        return chillerLeft;
    }

    public void setChillerLeft(Student chillerLeft) {
        this.chillerLeft = chillerLeft;
    }

    public void setChillerRight(Student chillerRight) {
        this.chillerRight = chillerRight;
    }

    public boolean hasChillerLeft() {
        return this.chillerLeft != null;
    }

    public boolean hasChillerRight() {
        return this.chillerRight!= null;
    }
}
