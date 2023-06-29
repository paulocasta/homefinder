package com.homefinder.domain;

public enum PropertyType {
    HOUSE("house"), DEPARTMENT("department");

    private String name;

    PropertyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
