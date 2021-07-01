package oop.animals;

public class MarineAnimal {

    private String name;
    private int length;
    private int finCount;
    private boolean isSaltWater;
    private boolean canSwim;

    public MarineAnimal(String name, int length, int finCount, boolean isSaltWater,
                        boolean canSwim) {
        this.name = name;
        this.length = length;
        this.finCount = finCount;
        this.isSaltWater = isSaltWater;
        this.canSwim = canSwim;
    }

    public MarineAnimal(String name){this.name = name; }

    public MarineAnimal(){};

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
