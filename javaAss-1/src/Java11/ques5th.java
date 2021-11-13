package Java11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class ques5th {

	static int count = 0;
	static Scanner sc = null;

	static int result = 0;

	public static void main (String[] args) throws IOException
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the option \n1.Insert New Price \n2.View Purchase Total \n3.Exit");

		int value = sc.nextInt();

		if (value == 1)
		{
			result = call(value);

			add (result+"");

			System.out.println("\n");

			main(null);
		}

		else if (value == 2)
		{
			System.out.println("Total Price of All Items"+ get() + "\n");

			main (null);
		}

		else if (value == 3)
		{
			System.out.println("Exit Program.........");
		}
	}

	public static int call(int value)
	{
		count++;

		System.out.println("Insert" + count + "st Price");
		value = sc.nextInt();
		
		result = result + value;

		System.out.println("Price has been saved to the file \n");

		System.out.println("Do you enter price for onne more value ? (yes/no)");

		String ans = sc.next();

		if (ans.equalsIgnoreCase("yes"))
		{
			call(value);
			return result;

		}
		else 
		{
			return result;
		}
	}

	public static void add (String value) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("E:\\Java11\\data.txt");

		byte [] b1 = value.getBytes();

		fout.write(b1);

		fout.close();	
	}

	public static int get() throws IOException
	{
		String res = "";
		
		FileInputStream fin = new FileInputStream ("E:\\Java11\\data.txt");

		int i = 0;

		while ((i = fin.read ()) != -1)
		{
			res = res+(char)i;
		}

		int output = Integer.parseInt(res);

		fin.close();

		return output;
	}

		
}