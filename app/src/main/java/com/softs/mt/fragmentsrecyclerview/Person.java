package com.softs.mt.fragmentsrecyclerview;

/**
 * Created by fkha0003 on 10/01/2019.
 */

public class Person {
    private String name;
    private String telNo;

    public Person(String name, String telNo) {
        this.name = name;
        this.telNo = telNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
