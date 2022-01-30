package String;

import java.util.ArrayList;
import java.util.List;

public class StringEx  implements p {

	public static void main(String arg[])
	{
		List<String> x = new ArrayList<String>();
		
		x.add("3");
		x.add("7");
		x.add("5");
		
		List<String> y  = new StringEx().dostuff(x);
		
		y.add("1");
		System.out.println(x);
	}
	
	public List<String> dostuff (List<String> z){
		z.add("9");
		return z;
		
	}
}

interface p {
	
	List<String> dostuff (List<String> z);
}
