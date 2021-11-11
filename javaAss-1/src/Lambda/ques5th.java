package Lambda;
import java.util.ArrayList;
import java.util.List;
public class ques5th 
{
  public static void main(String[] args) 
  {
	  List<String> names = new ArrayList<>();
	  names.add("Allen");
	  names.add("King");
	  names.add("James");
	  names.add("Jones");
	  
	  StringBuilder result = new StringBuilder();
	  names.forEach(s->result.append(s.charAt(0)));
	  System.out.println(result);
  }
  
}
