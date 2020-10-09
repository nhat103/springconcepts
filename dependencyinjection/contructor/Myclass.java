package javacode.springconcepts.dependencyinjection.contructor;

public class Myclass {

	MyDependency myDependency;

	public Myclass(MyDependency myDependency) {
		this.myDependency = myDependency;
	}

}
