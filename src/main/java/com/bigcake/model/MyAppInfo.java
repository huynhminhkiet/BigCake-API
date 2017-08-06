package com.bigcake.model;

/**
 * Created by Bigcake on 8/7/2017
 */
public class MyAppInfo {
    private String appName;
    private String description;
    private String version;

    public MyAppInfo(String appName, String description, String version) {
        this.appName = appName;
        this.description = description;
        this.version = version;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
