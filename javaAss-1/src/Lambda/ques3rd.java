package Lambda;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class ques3rd {

	public static void main(String[] args) {
		Consumer<Integer> c = i -> System.out.println(i);
		Predicate<Integer> gt = i ->(i>10);
		Supplier<Double> sp = ()->Math.random();
		Function<Integer,Double> f=(a)->a/2.0;
		System.out.println("Consumer");
		c.accept(30);
		System.out.println(gt.test(30));
		System.out.println("Supplier:"+ sp.get());
		System.out.println("Supply:"+f.apply(25));
	}
	
}