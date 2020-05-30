package OnlineOrder;

public class DecorateMain {

	public static void main(String[] args) {

     Burger basicBurger = new BurgersAdditive(new WithCheese());
     
		System.out.println("Ingredients:" + basicBurger.getDescription());
		
		System.out.println("Price:" + basicBurger.getCost());


   }
}
