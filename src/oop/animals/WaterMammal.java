package oop.animals;

public class WaterMammal extends MarineAnimal{

    private int maxTimeSubmerged;

    public WaterMammal(String name, int length, int finCount, boolean isSaltWater,
                       boolean canSwim, int maxTimeSubmerged){
        super(name, length, finCount, isSaltWater, canSwim);
        this.maxTimeSubmerged = maxTimeSubmerged;
    }

   public WaterMammal(String name){ super(name); }

    public WaterMammal(){};

    public int getMaxTimeSubmerged() {
        return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged) {
        this.maxTimeSubmerged = maxTimeSubmerged;
    }
    public String getName(){
        return super.getName().toUpperCase();
    }
}
