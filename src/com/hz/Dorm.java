package com.hz;

public class Dorm {

    public Couch couch;
    public Bed bed;
    public Student somewhere;

    public Dorm(Student studentOne, Student studentTwo, Student studentThree, Student studentFour) {
        this.couch = new Couch();
        this.bed = new Bed();

        this.couch.setChillerLeft(studentOne);
        this.couch.setChillerRight(studentTwo);

        this.bed.setSleeper(studentThree);

        this.somewhere = studentFour;
    }

    public Student getStudent() throws Exception {

        if(this.somewhere != null) {
            return this.somewhere;
        }

        throw new Exception("No students available");
    }

    public String getReport() {

        int amountOfSomewheres = (this.somewhere != null) ? 1 : 0;
        int amountOfSleepers = (this.bed.getSleeper() != null) ? 1 : 0;
        int amountOfLeftChiller = (this.couch.hasChillerLeft()) ? 1 : 0;
        int amountOfRightChiller = (this.couch.hasChillerRight()) ? 1 : 0;
        int amountOfChillers = amountOfLeftChiller + amountOfRightChiller;

        String msg = "There is " + amountOfSomewheres + " student somewhere "
                + " and " + amountOfSleepers + " student sleeping "
                + " and " + amountOfChillers + " student(s) chilling.";

        return msg;

    }
}
