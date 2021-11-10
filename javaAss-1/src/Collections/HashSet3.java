package Collections;
import java.util.*;
public class HashSet3 {

      public static void main(String[] args) {
		
    	  product p1 = new product("abc");
    	  product p2 = new product("pqr");
    	  product p3 = new product("mno");
    	  
    	  HashSet<product> h = new HashSet<>();
    	  h.add(p1);
    	  h.add(p2);
    	  h.add(p3);
    
    	  Iterator<product> i = h.iterator();
    	  while (i.hasNext())
    		  System.out.println(i.next());
    	  
    	   h.add(p3);  
    		  System.out.println("already added, duplicates will not be added");	  
	}		
}
class product
{
	private String product_name;
	public product(String product_name) {
		super();
		this.product_name = product_name;
	}
	public String getProduct_name() {
		return product_name;
	}
	@Override
	public String toString() {
		return " [product_name = " + product_name + "]";
	}
}
