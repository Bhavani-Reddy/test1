package Collections;
import java.util.*;


class Employee {
	private String name;
	private int id;
	private double sal;
	private String departments;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public Employee(String name, int id, double sal, String departments) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", departments=" + departments + "]";
	}	

}



public class TreeSet2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the following options in which manner you need to sort");
		System.out.println("1.name  2.id  3.salary   4.department");
		int choose = scanner.nextInt();
		//char choose = scanner.next().charAt(0);
		Set<Employee> s = null;
		if(choose == 1) {
			s = new TreeSet<>(new nameComp());	
		}
		else if(choose == 2) {
			s = new TreeSet<>(new idComp());
		}
		else if(choose == 3) {
			s = new TreeSet<>(new salComp());
		}
		else if(choose == 4) {
			s = new TreeSet<>(new depComp());
		}
		s.add(new Employee ("Nireekshan",123,50000,"Development"));
		s.add(new Employee ("Luffy",456,60000,"One Piece"));
		s.add(new Employee ("Naruto",789,30000,"Leaf Village"));
		s.add(new Employee("Jojo",111,90000,"London"));
		s.add(new Employee("Tanjiro",222,10000,"Deamon Slayer"));
		for(Employee temp:s) {
			System.out.println(temp);
			
		}

	}

}



 class idComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class nameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class depComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDepartments().compareTo(o2.getDepartments());
	}

}

class salComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSal() > o2.getSal()) {
			return 1;
		} else {
			return -1;
		}

	}

}
