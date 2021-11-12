package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream8to15 {
	public static void main(String[] args) {

		List<Transaction> list=Arrays.asList(
				new Transaction(new Trader("Iron Man", "Pune"), 2011, 5000),
				new Transaction(new Trader("Thor", "Bangalore"), 2012, 4000),
				new Transaction(new Trader("Hulk", "Pune"), 2011, 3000),
				new Transaction(new Trader("Captain", "Delhi"), 2012, 2000)
				);

		//Question 8
		list.stream().filter(x-> x.year==2011)
		.map(x-> x.value)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("==========================================");
		
		//Question 9
		list.stream().distinct()
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------");
		//Question 11
		list.stream().map(x->x.trader.name)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("==========================================");
		
		//Question 12
		list.stream().filter(x->x.trader.city.contains("Indore"))
		.map(x->x.trader)
		.forEach(System.out::println);
		
		System.out.println("==========================================");
		
		//Question 13
		list.stream().filter(x->x.trader.city.contains("Delhi"))
		.map(x->x.value)
		.forEach(System.out::println);
		
		System.out.println("==========================================");

		//Question 14
		Optional<Integer> max = list.stream().map(x->x.value)
				.max((i,j)->i.compareTo(j));
		System.out.println(max);
		
		System.out.println("==========================================");

		//question 15
		Optional<Integer> min = list.stream().map(x->x.value)
				.min((i,j)->i.compareTo(j));

		System.out.println(min);
	}


}
