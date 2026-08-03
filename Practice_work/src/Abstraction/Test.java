package Abstraction;

public class Test {
	public static void main(String[] args) {
	
	Dog dog=new Dog();
	dog.numOfLegs();//we can call this concrete method bcos Dog is a child class of Animal
    dog.sound();
    dog.food();
    
    Cat cat=new Cat();
    cat.sound();
    cat.food();
    
    //Animal ani=new Animal();  //cannot create a object for parent class bcos it is an abstract class
    //Because we cannot create an object for abstract class..
    //animal.sound()---if we call this then what will this gets called!?...JVM lands into ambuiguity
    //i.e no implementation for sound in Animal class
    
}
}
