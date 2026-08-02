package Final_key;

public class Dog extends Animal
{

	//void sleep() ---we cannot override this method bcos in parent clas it is declared as final
	//{
		//System.out.println("Dancinggg...");
	void sleep()
 	{
		System.out.println("sleeping...");
	}
}
