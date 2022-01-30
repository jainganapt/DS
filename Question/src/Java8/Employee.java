package Java8;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee> {

	public Integer empId;

	public String name;

	public String address;

	public Employee(Integer empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.getEmpId() == o.getEmpId()) {
			return 0;
		}

		return this.getEmpId() > o.getEmpId() ? 1 : -1;
	}

	@Override
	public int hashCode() {

		return this.getEmpId();
	}

	@Override
	public boolean equals(Object obj) {

		Employee e1 = (Employee) obj;

		if (this.getEmpId() == e1.getEmpId() && this.getName() == e1.getName()
				&& this.getAddress() == e1.getAddress()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String arg[]) {
		Set<Employee> s1 = new TreeSet<Employee>();

		Employee e1 = new Employee(1, "B", "Jodhpur");
		Employee e2 = new Employee(2, "C", "Japiur");
		Employee e3 = new Employee(3, "C", "Pali");
		Employee e4 = new Employee(4, "D", "Basni");
		Employee e5 = new Employee(5, "A", "XXXX");

		Employee e6 = new Employee(5, "E", "XXXXA");

		Employee e7 = new Employee(1, "A", "Jodhpur");
		s1.add(e1);
		s1.add(e2);
		s1.add(e4);
		s1.add(e5);
		s1.add(e6);
		s1.add(e3);
		s1.add(e7);

		System.out.println("Emp size" + s1.size());

		for (Employee s : s1) {
			System.out.println(s);

		}

		List<Employee> list = s1.parallelStream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		System.out.println("**************************");

		System.out.println("Sorted by name");

		for (Employee s : list) {
			System.out.println(s);

		}

	}
}
