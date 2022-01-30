package ctor;

public class Ctor2 
{ 
	// block to be excuted first 
	{ 
		System.out.println("init"); 
	} 
	Ctor2() 
	{ 
		System.out.println("default"); 
	} 
	Ctor2(int x) 
	{ 
		System.out.println(x); 
	} 

	// block to be executed after the first block 
	// which has been defined above. 
	{ 
		System.out.println("second"); 
	} 
	public static void main(String args[]) 
	{ 
		new Ctor2(); 
		new Ctor2(10); 
	} 
} 
