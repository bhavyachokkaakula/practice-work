package Abstraction;

public abstract class Omnivores extends Animal{

	@Override
	void sound() {
	//when you dont want to give implement this class--i.e this is a Child class and you dont want to 
	//implement this class --- THEN YOU NEED TO DECLARE THHIS CHILD CLASS AS ABSTRACT CLASSS
		//i.e---- public abstract class Omnivores extends Animal
	}
	//now the implemtation of this Omnivores will be done by child class...maybe example is  human

	@Override
	void food() {


	}
	
	

}
