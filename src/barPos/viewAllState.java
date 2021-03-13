package barPos;

import java.util.Scanner;

public class viewAllState implements State{

	@Override
	public void posStatus(Context context) {
		printAllMenus printAll = new printAllMenus();
		printAll.printBeerMenu();
		System.out.print("\n\n\n");
		printAll.printWineMenu();
		System.out.print("\n\n\n");
		printAll.printLiquorMenu();
		
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("\n\n\nWhat would you like to do next?\n"+
		"1) Main Menu\n"+
		"2) Checkout\n");
		
		int followUpCommand = usrInpt.nextInt();
		
		if (followUpCommand==1) {
			MainMenuStatus goBackToMenu = new MainMenuStatus();
			goBackToMenu.posStatus(context);
		}
		else if (followUpCommand==2) {
			CheckoutState checkout = new CheckoutState();
			checkout.posStatus(context);
		}
		
		context.setState(this);
	}

}
