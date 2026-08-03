package Abstraction;

public class Dog extends Animal{
	
	//it is mandatory that we should implemnet all the abstarct methods..even if we have 100 methods we should implement
	@Override
	void sound()
	{
		System.out.println("Bowwww");
	}
	// @Override keyword is not mandatory
	void food()
	{
		//here compulsiorly implement all the abstarct methods but not mandatory for concrete methods
		System.out.println("chicken..");
	}

}
