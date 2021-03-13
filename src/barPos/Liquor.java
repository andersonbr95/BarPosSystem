package barPos;

public abstract class Liquor extends Drink {

	String distillery;
	
	public void setDrinkType() {
		this.drinkType = "beer";
	}
	public String getDistillery() {
		return distillery;
	}
	public void setDistillery(String distillery) {
		this.distillery = distillery;
	}

}
