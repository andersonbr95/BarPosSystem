package barPos;

import java.util.Scanner;

public class MainMenuStatus implements State{

	public void posStatus(Context context) {
		
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------COOL HIP BAR MENU OPTIONS--------\n" + 
		"1) Menu Selections \n" + 
		
		"2) View All Menus\n"+
		"3) Checkout\n" +
		"4) Log Out\n");
		
		System.out.print("");

		int bartndrInpt = usrInpt.nextInt();
		
		if(bartndrInpt ==1) {
			ViewDrinkMenuState viewDrinks = new ViewDrinkMenuState();
			viewDrinks.posStatus(context);
			//insert View Drink Menu State Here
		}
		else if(bartndrInpt == 2) {
			viewAllState viewAll = new viewAllState();
			viewAll.posStatus(context);
		}
		else if(bartndrInpt == 3) {
			CheckoutState checkoutState = new CheckoutState();
			checkoutState.posStatus(context);
		}
		else {
			System.exit(0);
		}
	context.setState(this);
	}
}
