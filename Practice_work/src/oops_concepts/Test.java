package oops_concepts;

public class Test {
	public static void main(String[] args) {

	Parent p=new Parent();
	System.out.println(p.a);
	p.m1();
	
	Child c= new Child();
	System.out.println(c.b);
	c.m2();
	
	    System.out.println("==============");//after using child class extends parent class
	    System.out.println(c.a);
	    c.m1();
	    
	    System.out.println("calling with child object");// if same variable exists in both pa,ch.. classes 
	    System.out.println(c.a);
	    
	    System.out.println("==============");

	    System.out.println("Calling with parent object");
	    System.out.println(p.a);
	    
	    p.m1();//calling using parent class
	    c.m1();//since m1 method is present in both classes,calling using child class
	   
	    //c.m1() if m1 method is not there in child class then m1 method in parent class gets executed..
	    //you cannot acquire the properties of child class using parent object


}
}
