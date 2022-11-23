package Abstraction;

public abstract class Dog {
	String breed;
	String color;
	public void bark() {
		System.out.println("WOof WOof");
	}
	
	public abstract void sniff();
}
