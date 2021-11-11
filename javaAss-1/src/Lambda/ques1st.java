package Lambda;

@FunctionalInterface
interface Arith
{
	int operations(int a , int b);
}


public class ques1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith add = (a,b)->(a+b);
		System.out.println("addition is : "+add.operations(10,10));
		Arith sub = (a,b)->(a-b);
		System.out.println("subtraction is : "+sub.operations(40,10));
		Arith mul = (a,b)->(a*b);
		System.out.println("multiplication is : "+mul.operations(5,10));
		Arith div = (a,b)->(a/b);
		System.out.println("division is : "+div.operations(100,10));
		
		
       
	}

}
