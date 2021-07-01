package oop.animals;

import java.util.Locale;

public class Fish extends MarineAnimal{

    private boolean hasScales;

    public Fish(String name, int length, int finCount, boolean isSaltWater,
                boolean canSwim, boolean hasScales) {
        super(name, length, finCount, isSaltWater, canSwim);
        this.hasScales = hasScales;
    }

    public Fish(String name){
        super(name);
    }

    public Fish(){};


    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public String getName(){
        return super.getName().toUpperCase();
    }
}