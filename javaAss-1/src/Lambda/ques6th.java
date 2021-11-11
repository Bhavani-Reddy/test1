package Lambda;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

@SuppressWarnings("unchecked")
class lam implements UnaryOperator<String>
{
	public String apply(String s)
	{
		return s.toUpperCase();
	}
}

public class ques6th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> upper = new ArrayList<String>();
		upper.add("Mom");
		upper.add("Dad");
		upper.add("brother");
		upper.add("sister");
		upper.add("friend");

		System.out.println("Before the operation : "+upper);
		upper.replaceAll(new lam());
		System.out.println("After the operations : "+upper);
		
		
	}

}
