package Collections;

import java.util.*;

public class TreeMapTest {
public static void main(String[] args) {
	
	
	Long p=Long.valueOf("7702101116");
    Long q=Long.valueOf("7093312958");
    Long r=Long.valueOf("9010205125");
    Long s=Long.valueOf("9849983259");
	Contact c1 = new Contact("abc","abc@gmail.com",Gender.male);
	Contact c2 = new Contact("pqr","pqr@gmail.com",Gender.female);
	Contact c3 = new Contact("efg","efg@gmail.com",Gender.male);
	Contact c4 = new Contact("stu","stu@gmail.com",Gender.female);
	
	
	TreeMap<Long , Contact> map = new TreeMap<>();


	map.put(p, c1);
	map.put(q, c2);
	map.put(r, c3);
	map.put(s, c4);
	
	 Set<Map.Entry<Long,Contact> > entrySet = map.entrySet();
	 for (Map.Entry<Long,Contact> entry : entrySet)    
	 {
		 
		 System.out.println(entry.getKey());
		 System.out.println(entry.getValue());
		 System.out.println("Key:Value [" + entry.getKey() + " , " + entry.getValue() + "]");
	 }  
}
}

enum Gender
{
	male,female;
}
class Contact implements Comparable<Contact>
{
	private String name;
	private String email;
	private Gender gender;
	private Long number;
	public Contact(String name, String email, Gender gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Gender getGender() {
		return gender;
	}

	public Long getNumber() {
		return number;
	}
	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return o.getNumber().compareTo(this.getNumber());
	}
	
	public String toString() {
		return "Contact [" +name+ "," +email+ "," +gender+ "," +number+ "]";
		
	}
	
	
}