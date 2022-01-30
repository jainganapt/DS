package JavaArray30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
	
	public static void main(String arg[])
	{
		emp e1 = new emp(1, "a");
		emp e2 = new emp(2, "c");
		emp e3 = new emp(3, "d");
		emp e4 = new emp(4, "b");
		
		List<emp> list1 = new ArrayList<emp>();
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		
		List<emp> list2=list1.stream().sorted(Comparator.comparing(emp::getId).reversed()).collect(Collectors.toList());
		
		
		
		list2.listIterator().forEachRemaining(s->System.out.println(s.getName()));
		
		
	}
	

}

 
class emp{
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	emp(int a,String n)
	{
		this.id=a;
		this.name=n;
	}
	
	
}