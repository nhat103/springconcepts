package javacode.springconcepts.dependencyinjection.contructor;

public class MyDependency {

	String name;
	int age;

	public MyDependency() {
	}

	public MyDependency(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printDay() {
		System.out.println("nhat");
	}
	
	public static void main(String[] args) {
		
	}

}
