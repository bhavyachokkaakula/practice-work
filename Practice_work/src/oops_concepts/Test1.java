package oops_concepts;

public class Test1 {
	public static void main(String[] args) {
		
	
	FuelCar fc= new FuelCar();
	System.out.println(fc.FuelCapacity);
	System.out.println(fc.numOfWheels);
	System.out.println(fc.price);
	
	//demonstrating Multi-Level Inheritance
	   
	fc.start();
	fc.drive();
	fc.fillFuel(); //calling all parent class features with a single car.
	
	System.out.println("================");
	
	//demonstrating Hierarchical Inheritance using battery class
	
	BatteryCar bc=new BatteryCar();
	bc.start();
	bc.drive();
	
	//bc.fillfuel() -- calling this method is not possible, they both have the same parent but cannot have the same features
	//taking the example of Parent-- you & your sister does not look same
	
	
	//demo of Multiple Inheritance
	
	    
	
	
	}

}
