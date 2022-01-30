package Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class emp {
	
	public emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private int age;
}
public class Test1 {

	
	public static void main(String arg[]) throws IOException
	
	{
		
		/*
		 * try (Scanner scanner = new Scanner(new File("testRead.txt")); PrintWriter
		 * writer = new PrintWriter(new File("testWrite.txt"))) { while
		 * (scanner.hasNext()) { writer.print(scanner.nextLine()); } }
		 * 
		 * try(FileInputStream input = new FileInputStream("file.txt")) {
		 * 
		 * int data = input.read(); while(data != -1){ System.out.print((char) data);
		 * data = input.read(); } }
		 * 
		 * 
		 * 
		 * emp e1 = new emp(1,"A",11); emp e2 = new emp(2,"B",12); emp e3 = new
		 * emp(3,"C",13);
		 * 
		 * ArrayList<emp> list = new ArrayList<emp>();
		 * 
		 * 
		 * list.add(e1); list.add(e2); list.add(e3);
		 * 
		 * list.stream().sorted(Comparator.comparing(emp::getName)).collect(Collectors.
		 * toList());
		 * 
		 * for(emp a: list) { System.out.println(a.getName()); }
		 */
		
		
		DateTimeFormatter logicalDate = DateTimeFormatter.ofPattern("yyyyMMdd");
		DateTimeFormatter sysDateTime = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

		LocalDateTime today = LocalDateTime.now(ZoneId.of("America/Montreal"));

		System.out.println(today.format(logicalDate));

		System.out.println(today.format(sysDateTime));

		
	}
}
