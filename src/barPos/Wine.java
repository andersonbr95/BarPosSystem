package barPos;

public abstract class Wine extends Drink{
	String winery;
	
	public void setDrinkType() {
		this.drinkType = "wine";
	}
	
	public String getWinery() {
		return winery;
	}

	public void setWinery(String winery) {
		this.winery = winery;
	}	
}
