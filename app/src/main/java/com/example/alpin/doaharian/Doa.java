package com.example.alpin.doaharian;

/**
 * Created by Alpin on 11/07/2017.
 */

public class Doa {
    private String name;

    public Doa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Doa{" +
                "name='" + name + '\'' +
                '}';
    }
}
