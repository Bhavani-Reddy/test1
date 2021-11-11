package Lambda;
import java.util.*;
public class ques4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<String> a = new ArrayList<>();
		a.add("Bhav");
		a.add("Keerth");
		a.add("Nikki");
		a.add("Ragi");		
		a.add("Mintu");
		a.add("Tinku");
		System.out.println("Before removing : "+a);
		a.removeIf(name->(name.length()%2!=0));
		System.out.println("After removing : "+a);
		
		
	}

}
