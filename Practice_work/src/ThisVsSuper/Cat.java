package ThisVsSuper;

public class Cat extends Animal{
	
	int age=25;
	String food;
	String colour;
	
	public Cat(String food , String colour)
	{
		 this.food=food;
		 this.colour=colour;
	}
	void sound()
	{
		//staying in cat class and we can access Animal class variables
		
		//this.age=20; //this is possible here bcos cat extends animal class
		System.out.println(this.colour+" cat sounds meow...");
		System.out.println("age:"+ this.age);
		System.out.println("Animal age:"+ super.age);
		
	}
}
