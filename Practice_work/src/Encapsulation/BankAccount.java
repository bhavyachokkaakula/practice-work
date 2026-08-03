package Encapsulation;

public class BankAccount {
	
	private long accno;
	private String ifsc;
	 private String Username;
	private String branch;
	private double balance;
	
	public long getAccNum()
	{
		return this.accno;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double balance)//setting the 
	{
		if(balance>=0)
		{
		this.balance=balance;
		}
		else
		{
			System.out.println("Invalid Balance....Balance cannot be negative");
		}
		
	}
	
	
	
	
	
	
	
	public BankAccount(long accno, String ifsc, String username, String branch, double balance) {
		super();
		this.accno = accno;
		this.ifsc = ifsc;
		Username = username;
		this.branch = branch;
		this.balance = balance;
	}
	//since we made our variables as private so now how can we access them?? 
	//therefore we write and use some public methods to access them----getters and setters
	
	
	
	
	

}
