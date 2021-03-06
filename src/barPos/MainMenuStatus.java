package barPos;

import java.util.Scanner;

public class MainMenuStatus implements State{

	public void posStatus(Context context) {
		
		Scanner usrInpt = new Scanner(System.in);
		
		//Sub in the main menu iterator if time allows
		System.out.print("--------COOL HIP BAR MENU OPTIONS--------\n" + 
		"1) Menu Selections \n" + 
		"2) Checkout\n" +
		"3) Log Out\n");
		
		System.out.print("");

		int bartndrInpt = usrInpt.nextInt();
		
		if(bartndrInpt ==1) {
			ViewDrinkMenuState viewDrinks = new ViewDrinkMenuState();
			viewDrinks.posStatus(context);
			//insert View Drink Menu State Here
		}
		else if(bartndrInpt == 2) {
			System.out.print("Here is the cashout menu place holder");
			
			//To-do cashout menu state command center
		}
		else {
			System.exit(0);
		}
	context.setState(this);
	}
}
