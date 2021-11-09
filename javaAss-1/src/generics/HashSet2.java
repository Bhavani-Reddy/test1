package generics;

import java.util.HashSet;

class Employee_gen {
      int id,salary;
      String emp_name,department;
	public Employee_gen(int id, int salary, String emp_name, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.emp_name = emp_name;
		this.department = department;
	}
      public void display_details()
      {
    	  System.out.println(id);
    	  System.out.println(salary);
    	  System.out.println(emp_name);
    	  System.out.println(department);
      }    
}
public class HashSet2
{
	public static void main(String[] args) 
	{
		HashSet<Employee_gen> set = new HashSet<>();
		Employee_gen e1 = new Employee_gen(123,20000,"bhav","development");
		set.add(e1);
		for(Employee_gen e:set){  
		    e.display_details();
		    }  
	}
}
