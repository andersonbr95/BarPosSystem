package barPos;
import java.util.ArrayList;


public class Checkout{
	//Command Pattern
	Drink tempDrink;
	ArrayList<Drink> checkOut = new ArrayList<Drink>();
	
	
	public void printReceipt(){
		int i = 0;
		
		for(i = 0; i > checkOut.size(); i++){
			if(checkOut.size()  > 0) {
			checkOut.get(i).getDrinkName();
			System.out.print("$" +checkOut.get(i).getCost());}
			else {
				CheckoutState redoCheckout = new CheckoutState();
			}
		}
	}
	
	public Drink addtoCheckout(int drinkChoice) {
		
		
		checkOut.add(tempDrink);
	 	
		return tempDrink;
	}
}
