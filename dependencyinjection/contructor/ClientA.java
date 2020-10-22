package javacode.springconcepts.dependencyinjection.contructor;

public class ClientA {
	ServiceB service;
	
	public void doSomthing() {
		service.getInfo();
	}

}
