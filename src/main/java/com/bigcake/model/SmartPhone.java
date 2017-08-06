package com.bigcake.model;

/**
 * Created by Bigcake on 8/7/2017
 */
public class SmartPhone {
    private String name;
    private String serial;

    public SmartPhone(String name, String serial) {
        this.name = name;
        this.serial = serial;
    }

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
}
