package javacode.springconcepts.dependencyinjection.contructor;

public class Myclass {

	MyDependency myDependency;// reference variable

	MyDependency mydien = new MyDependency();

	public Myclass(MyDependency myDependency) {
		this.myDependency = myDependency;
	}

	public Myclass() {
	}

	public void print() {
		myDependency.printDay();
	}

	public static void main(String[] args) {

		Myclass myclass = new Myclass();

		// myclass.mydien.printDay();
		myclass.print();

	}

}
