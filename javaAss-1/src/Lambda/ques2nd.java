package Lambda;
import java.util.Arrays;
import java.util.List;

public class ques2nd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Orders> orders=Arrays.asList(new Orders(3455),
					new Orders(545666),
					new Orders(50000));
		orders.stream().filter(t->t.getPrice()>10000).forEach(t -> System.out.println("order is accepted:"+t));	
		}
	}

class Orders {
	double price;
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public Orders(double price) {
		super();
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [price=" + price + "]";
	}
}