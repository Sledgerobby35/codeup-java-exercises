package oop.animals;

public class SomethingFishy {

    public static void main(String[] args) {

        MarineAnimal marineAnimal;
        marineAnimal = new WaterMammal("Blue Whale");
//        marineAnimal.setMaxTimeSubmerged(30);
//        System.out.println(marineAnimal.getMaxTimeSubmerged);

        System.out.println(marineAnimal.getName());
        marineAnimal = new Fish("Red Snapper");
        System.out.println(marineAnimal.getName());
    }
}
