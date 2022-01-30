package String;

class exc0 extends Exception{} /* asa */

class exc1 extends exc0{}

public class Except  {
	
	public static void main(String arg[])
	{
		
		try {
			throw new exc1();
		}
		catch (exc0 e1)
		{
			System.out.println("ex cauht");
		}
		catch (Exception e)
		{
			System.out.println("asdasd");
		}
		
	}

}
