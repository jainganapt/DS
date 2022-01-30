package Java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import Collection.Employee;

@FunctionalInterface
interface Foo {
	void test();
}

public class StreamTest {
	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 21, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 22, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		ListIterator<Student> itr = students.listIterator();

		students.stream().filter(s -> s.getName().contentEquals("Jayesh")).forEach(System.out::println);

		students.stream().filter(s -> s.getAddress().getZipcode().contentEquals("1235")).forEach(System.out::println);

		students.stream().filter(s -> s.getMobileNumbers().stream().anyMatch(x -> x.getNumber().contentEquals("3333")))
				.forEach(System.out::println);

	
		Employee e = new Employee(1L, "a", LocalDate.now());
		
		

		Employee e1 = new Employee(2L, "b", LocalDate.now());

		Employee e3 = new Employee(3L, "c", LocalDate.now());

		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		TreeMap<Employee, String> tm = new TreeMap<Employee, String>();

		hm.put(e3, "employee 1");
		hm.put(e, "employee 1");
		hm.put(e1, "employee 1");

		tm.put(e, "employee-5");
		tm.put(e1, "employee-3");
		tm.put(e3, "employee-1");

		LinkedHashMap<String, Integer> unsortedMap = new LinkedHashMap<>();

		unsortedMap.put("1", 1);
		unsortedMap.put("2", 2);
		unsortedMap.put("5", 5);
		unsortedMap.put("3", 3);
		unsortedMap.put("4", 4);

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

		unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("unSorted Map   : " + unsortedMap);
		System.out.println("Sorted Map   : " + sortedMap);

		Map<Employee, String> sortbyname = new HashMap<Employee, String>();

		tm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
				.forEachOrdered(x -> sortbyname.put(x.getKey(), x.getValue()));
		
		/*
		 * tm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(
		 * Employee::getName).reversed())) .collect( Collectors.toMap (x -> x,
		 * Employee::getName, (oldValue, newValue) -> oldValue, // if same key, // key
		 * LinkedHashMap::new));
		 */

		 Map MapStore = students.stream()
	                .sorted(Comparator.comparingLong(Student::getAge).reversed())
	                .collect(
	                        Collectors.toMap(
	                        		Student::getAge, x->x, // key = name, value = websites
	                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
	                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
	                        ));
		 
		 
		 Map m3= students.parallelStream().sorted(Comparator.comparing(Student::getAge))
				 .collect(Collectors.toMap(Student::getName, x->x));
		 	     
		 System.out.println("Sorted Map list to map   : " + MapStore);
   		 
			/*
			 * students.stream()
			 * .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getAge)))
			 * .collect( Collectors.toMap (x -> x, Student::getAge, (oldValue, newValue) ->
			 * oldValue, // if same key, // key LinkedHashMap::new));
			 */
         
		 
		    Map<String,Student>m1= students.stream().collect(Collectors.toMap(Student::getName, x->x));
		 
			Map m2 = students.stream().collect(
					Collectors.toMap(Student::getName, x -> x, (oldvalue, newValue) -> oldvalue, HashMap::new));

		 System.out.println("Sorted Map list to map   : " + MapStore);

		
		Map<Employee, String> sortbyValue = new HashMap<Employee, String>();
		/// it will be hashmap and if create treeMap then naturl order will be

		tm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
				.forEachOrdered(x -> sortbyValue.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map   : " + tm);
		System.out.println("Sorted Map  : " + sortbyname);
		System.out.println("Sorted Map   : " + sortbyValue);
		
		List<Integer> s1  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> s2=s1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		s2.stream().forEachOrdered(s->System.out.println(s+" "));
		
		System.out.println("asdasdasd");
		
	    long c=	"hackerearth".chars().distinct().count();
	    
	    System.out.println(c);
	    
	    

		
		
	}
}
