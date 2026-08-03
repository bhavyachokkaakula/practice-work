package Abstraction;

public class Cat extends Animal{
	
	@Override
	void sound()
	{
		System.out.println("meowwww");
	}
	// @Override keyword is not mandatory
	void food()
	{
		//here compulsiorly implement all the abstarct methods but not mandatory for concrete methods
		System.out.println("Milk..");
	}
//All the child classes should implement all the abstract methods in parent class..
//even if we have 100..child classes all these child classes should implement all the abstract methods
	//which are present in parent class...

}
