package barPos;

public abstract class Drink {
	String drinkName, drinkType;
	double cost;
	String description;
	

	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	
	public String getDrinkType() {
		return drinkType;
	}
	
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}