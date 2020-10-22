package javacode.springconcepts.dependencyinjection.contructor;

public class ClientA implements Client {

	Service service;// interface

	public ClientA(Service service) {
		this.service = service;
	}

	@Override
	public void doSomthing() {
		String info = service.getInfo();

	}

	/*
	 * ServiceB service;// class
	 * 
	 * public void doSomthing() { service.getInfo(); }
	 */

}
