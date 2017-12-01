package com.example.marlon.startdaggar;

/**
 * @author Marlon
 * @date 2017/12/1
 */

public class Clothes {
    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }

}
