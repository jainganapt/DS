package rules;

import java.util.ArrayList;
import java.util.List;

public class ConCureentMod {

	public static void main(String arg[])
	{
		List<Integer> arr =new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		
		for(Integer a:arr)
		{
		    System.out.println(a);	
			arr.add(a);
		}
		
	}
}
