package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student piet = new Student("Piet");
        Student jan = new Student("Jan");
        Student klaas = new Student("Klaas");
        Student koos = new Student("Koos");

        Dorm thereIsAHousInMiddelburg = new Dorm(piet, jan, klaas, koos);


        // Here comes the bus
        Bus bus133 = new Bus();

        // report status before
        System.out.println(thereIsAHousInMiddelburg.getReport());
        try {

            System.out.println("Pickup one student");
            Student student = thereIsAHousInMiddelburg.getStudent();
            bus133.getIn(student);

            System.out.println(thereIsAHousInMiddelburg.getReport());

        } catch (Exception ex) {

            System.out.println("It seems that there are no students available.");
        }

    }
}
