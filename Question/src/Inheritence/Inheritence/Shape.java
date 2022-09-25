package Inheritence;

import java.util.ArrayList;
import java.util.List;

enum lag
{
	P(10), J(9),A(12);
	
	private int c;
	
	lag(int p)
	{
		c=p;
	}
	int getC()
	{
		return c;
	}
}

public class Shape {
	
	public int area()
	{
		return 1;
	}
	public static void main(String arg[])
	{
		square squ = new square();
		Shape shp = new Shape();
		
		//s=s1;
		//squ=shp; //downcasting example //compilation issue
		 
		shp=squ; //upcasting will work
		
		String s11 ="hello";
			
		String s22= new String(s11);
		
		System.out.println((s11==s22)+ " "+s11.equals(s22));
		
		//s.area1();
		
		
		lag l1;
		
		for (lag l2: lag.values())
		{
			System.out.println(l2+" "+l2.getC()+"code.");
		}
		
		
		
	}

}

class square extends Shape
{
	
	public void area1()
	{
		List<String> l1  = new  ArrayList<String>();
		
		l1.add("1");
		l1.add("2");
		l1.add("3");
		
		for(String s1 : l1)
		{
			s1=s1+"50";
		}
		
		System.out.println(l1);
		
	}
	
	
}
