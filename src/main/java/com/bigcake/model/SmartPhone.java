package com.bigcake.model;

/**
 * Created by Bigcake on 8/7/2017
 */
public class SmartPhone {
    private int id;
    private String name;
    private String serial;

    public SmartPhone(int id, String name, String serial) {
        this.id = id;
        this.name = name;
        this.serial = serial;
    }

    public SmartPhone() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
