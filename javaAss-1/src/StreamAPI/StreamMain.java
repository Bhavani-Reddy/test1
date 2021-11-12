package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruits {
	
	private String name;
	private int calories;
	private int price;
	private String color;
	
	public Fruits(String name,Integer calories,Integer price,String color) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public String getColor() {
		return color;
	}
	@Override
    public String toString() {
    	return this.name+ " " + this.calories+ " " + this.price+" " +  this.color + " ";   
    } 
}
public class StreamMain {

	public static void main(String[] args) {
		
		List<Fruits> fruitslist=Arrays.asList(new Fruits("Mango",95, 90,"Yellow"),
		new Fruits("Apple", 105, 30, "Red"),
	    new Fruits("Strawberry", 25, 10,"Red"),
		new Fruits("Cherry", 10, 10, "Red"),
		new Fruits("Grapes", 15, 20, "Green"));
		
	
		List<Fruits> sortedList=fruitslist.stream()
				//.filter(x->x<100)
				.sorted(Comparator.comparingInt(Fruits::getCalories).reversed())
				.collect(Collectors.toList());
		System.out.println("Fruits with calories<100 are:");
		sortedList.forEach(System.out::println);	

		System.out.println("-----------------------------------------------------");
		List<Fruits> colorList=fruitslist.stream()
				.sorted(Comparator.comparing(Fruits::getColor))
				.collect(Collectors.toList());
		System.out.println("Colorwise sorting of fruits is:");
		colorList.forEach(System.out::println);
	}

}
