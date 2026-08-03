package Encapsulation;

public class Transaction {

	public static void main(String[] args) {
		
		BankAccount ba1= new BankAccount(1234,"fayyy","fbert1230","hyderabad",19);
		
		//System.out.println(ba1.balance);
		//ba1.balance=143;
		//System.out.println(ba1.balance);// see we are changing the balance  as our wish,
		//then everyone can access and change your balance too.. so we need to encapsulate them
		//so now declaring all variables with private access modifiers
		
		
	//we cant normally access private variables in another class,so we use getters and setters methods
		long num=ba1.getAccNum();//we can access by using methods
		System.out.println(num);
		
		double bal=ba1.getBalance();
		System.out.println(bal);
		
		ba1.setBalance(143);
		bal=ba1.getBalance();
		System.out.println(bal);
		
		
		
		System.out.println("==========================");
		ba1.setBalance(99);
		double balance=ba1.getBalance();
		System.out.println(balance);
		
		
		 //by  mistake when an accountant add -2000 ..so then we have written setters...
		
		ba1.setBalance(-2000);
		bal=ba1.getBalance();
		System.out.println(bal); 
	}
}
