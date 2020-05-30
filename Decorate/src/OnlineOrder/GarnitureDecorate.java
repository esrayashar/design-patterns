package OnlineOrder;

public class GarnitureDecorate implements Burger{

	protected Burger garnBurger;
	
	public GarnitureDecorate(Burger newBurger) {
		garnBurger=newBurger;
		
	}

	@Override
	public String getDescription() {
		return garnBurger.getDescription();
	}

	@Override
	public double getCost() {
		return garnBurger.getCost();
	}
	
	
}
