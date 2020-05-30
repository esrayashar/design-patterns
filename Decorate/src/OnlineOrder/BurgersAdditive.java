package OnlineOrder;

public class BurgersAdditive extends GarnitureDecorate {
	
	public BurgersAdditive(Burger newBurger) {
		
		super(newBurger);
		
		System.out.println("Adding");
		
		
	}
	public String getDescription() {
		return garnBurger.getDescription() + ",Cheese";
	}

	public double getCost() {
		return garnBurger.getCost()+ 1.90;
	}
	

}
