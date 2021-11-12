package Java11;


@FunctionalInterface
interface SI
{
	double operation(float p, float t, float r);
}

public class ques1st {

	public static void main(String[] args) {
		
		SI s1 = (p,t,r)->(p*t*r)/100;
		System.out.println("Simple Interest: "+s1.operation(90000, 5, 3));
	}
}
