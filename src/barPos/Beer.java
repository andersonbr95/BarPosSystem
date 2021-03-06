package barPos;

public abstract class Beer extends Drink {

	String brewery;
	
	public void setDrinkType() {
		this.drinkType = "beer";
	}
	public String getBrewery() {
		return brewery;
	}
	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}

}
