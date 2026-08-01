package ThisVsSuper;

public class Animal {
	String name;
	int numofLegs;
	int age=35;
	
	public Animal(String animalname,int legs,int animalage)
	{
		name=animalname;
		numofLegs=legs;
		age=animalage;
	}
	
	public Animal()
	{
		//this constructor is for demonstrating super keyword.
		//bcos we have created a non-paratermetized constructor so jvm does not provide parametertized con
	}
	
//if you use same names in parameters and instance variables then jvm dont understand which is local nd instance
//so inorder to jvm understand we use this keyword
	
	void print()
	{
		System.out.println(this.name);
		System.out.println(this.numofLegs);
		System.out.println(this.age);
	}
	
	//static void print2()
	//{
	//	System.out.println(this.name);
	
	//this method does not work with static methods,static variables bcos, Static method is loaded during clss 
	//whereas this being a current class object-- objects are created during runtime
	//by the time static method gets executed  objects are not created
	

}
