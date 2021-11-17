package com.hz;

import java.util.HashMap;

public class Bus extends HashMap<String, Student> {

    public void getIn(Student student){
        this.put(student.name, student);
    }
}
