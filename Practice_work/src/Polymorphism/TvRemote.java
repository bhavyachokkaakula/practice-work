package Polymorphism;

public class TvRemote {

	int volume;
	
	public void increaseVol()
	{
		this.volume++;
		System.out.println("current vol:"+ volume);
	}
	public void increaseVol(int volume)
	{
		this.volume+=volume;
		System.out.println("cuurennt vol:"+this.volume);
	}
	public void increaseVol(String volume) 
	{
		
	}
	
}
