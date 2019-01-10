package com.siam.scjpexamples;

public class TestAnimals {

    public static void main(String[] args) {
	    Animal a = new Animal();
	    Animal b = new Horse();

	    a.eat(); // runs the Animal version of eat()
	    b.eat(); // runs the Horse version of eat()
	    ((Horse) b).buck(); // meltdown at runtime without casting
    }
}
