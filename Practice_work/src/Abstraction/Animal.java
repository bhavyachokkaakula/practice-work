package Abstraction;

public abstract  class Animal {
	
	abstract void sound();
	//we made this abstract bcos, What sound does the animal make!?.....
	//Then we need to know the animal name for telling which sound it makes..so this implementation will be done by child class

	abstract void food();
	
	
	void numOfLegs()
	{
		System.out.println("4 Legs....");
		//we dont compulsorily override this method,bcos it a concrete method,
		//but definetly abstract methods should be overridden or implemented
	}
}
