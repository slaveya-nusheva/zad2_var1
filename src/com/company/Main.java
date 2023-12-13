package com.company;

public class Main {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        Bird b = new Bird();
        t.setName("Ogi");
        b.setHighOgFlight(108.56);

	AnimalHouse<Tiger> tigerHouse = new AnimalHouse<>();
    AnimalHouse<Bird> birdHouse = new AnimalHouse<>();
    tigerHouse.animal = t;
    birdHouse.animal = b;
    }
}
