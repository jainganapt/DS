package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
	
	public static void main(String arg[])
	{
		String arrr[]= {"abc@gmail.com","abc+abc@gmail.com","abc+@mail.com","abc@gm.ail.com","acnc.abc.@gmail.com"};
		
		uniqueEmail(arrr);
		
		
	}
	
	public static void uniqueEmail(String[] arrr)
	{
		Set<String> uemail = new HashSet<>();
		
		for(int i=0;i<arrr.length;i++)
		{
			int domainpostion = arrr[i].indexOf("@");
			
			String first_name = arrr[i].substring(0, domainpostion);
			
			String domain_name =arrr[i].substring(domainpostion ,arrr[i].length());
			
			if(first_name.contains("+"))
			{
				int plus_positon =first_name.indexOf("+");
				 
				first_name=first_name.substring(0,plus_positon);	 
			}
			
			first_name=first_name.replaceAll("\\.", "");
			String femail =first_name+domain_name;
			uemail.add(femail);
			
		}
		
		for(String s :uemail)
		{
			System.out.println("=>"+s);
		}
		
	}

}
