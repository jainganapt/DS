package DesignPattern;

public class SingleTon {
	//eager
	
	public volatile static SingleTon s1 = new SingleTon();
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstace()
	{
		return s1;
	}
	
	public static void main(String arg[])
	{
		System.out.println("SingleTon"+SingleTon.getInstace());
		
	}

}
