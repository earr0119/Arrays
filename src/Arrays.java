import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
		ArrayList Food = new ArrayList();
		
		Food.add("Pizza");
		Food.add("Burger");
		Food.add("Nuggets");
		Food.add("Fries");
		Food.add("IceCream");
		
		System.out.println(Food);
		
		Food.remove(0);
		Food.remove(1);
		Food.remove(2);
		
		System.out.println(Food);
	}
	
}


