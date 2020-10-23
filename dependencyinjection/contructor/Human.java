package javacode.springconcepts.dependencyinjection.contructor;

public class Human {
	// Animal animal = new Animal();
	Animalinter animal;// not need to initial Animal Object

	public void getInfo() {
		animal.infoAniamal();
	}

}
