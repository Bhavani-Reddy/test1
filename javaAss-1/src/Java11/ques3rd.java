package Java11;
import java.util.ArrayList;
import java.util.Arrays;
public class ques3rd {

	public static void main(String[] args) 
	{
		String str="A quick brown fox jumps over lazy dog";
		ArrayList<String> strarr = new ArrayList<>();
		strarr.addAll(Arrays.asList(str.split(" ")));
		String[] ar=strarr.toArray(String[]::new);
		Arrays.stream(ar).forEach(t-> System.out.println(t));
		 
	}
}