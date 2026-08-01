package ThisVsSuper;

public class Test {
	public static void main(String[] args) {
		
		Animal an=new Animal("dog",4,5);
		//an.age=20; --this is possible
		
		//this.age=20 --- not possible bcos, this can be used with same class i.e it refers current class object
		//if we use this in this class,then it bcoms Test class refernce and not animal class refernce.
		//if we use this keyword here, then it refers to Test class obj 
		an.print();
		
		System.out.println("================");
		
		Cat cat= new Cat("Milk","white");
				cat.sound();
	}
}

