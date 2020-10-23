package javacode.springconcepts.dependencyinjection.contructor;

public class DI {

	MyDependency mydi = new MyDependency();

	public static void main(String[] args) {

		DI di = new DI();

		di.mydi.printDay();
	}
}
