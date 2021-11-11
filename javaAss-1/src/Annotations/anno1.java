package Annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Test
{
	int testcase();
}
public class anno1 {

	@Test(testcase=1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
	}

}
