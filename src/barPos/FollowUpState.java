package barPos;

import java.util.Scanner;

public class FollowUpState implements State{
	public void posStatus(Context context) {
		
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("What would you like to do next?\n"+
		"1)Order Drinks\n"+
		"2)View Menus\n" + 
		"3)Return Home\n");
		
		int followUpCommand = usrInpt.nextInt();
		
		if (followUpCommand==1) {
			//placeholder for order state
		}
		else if (followUpCommand==2) {
			ViewDrinkMenuState goBackToMenu = new ViewDrinkMenuState();
			goBackToMenu.posStatus(context);
		}
		else {
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.posStatus(context);
		}
	}
}
