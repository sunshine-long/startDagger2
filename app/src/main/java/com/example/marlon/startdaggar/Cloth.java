package com.example.marlon.startdaggar;

/**
 * @author Marlon
 * @date 2017/12/1
 */

public class Cloth {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "布料{" + "color='" + color + '\'' + '}';
    }
}
