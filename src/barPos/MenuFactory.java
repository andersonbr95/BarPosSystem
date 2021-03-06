package barPos;

import java.util.Scanner;

public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Beer Menu\n"+
		"2) Wine Menu\n"+
		"3) Liquor Menu\n"+
		"4) Home Screen");
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			BeerMenu beermenu = new BeerMenu();
			PrintBeerMenu prntbrmnu = new PrintBeerMenu(beermenu);
			
			prntbrmnu.printMenu();
		}
		
		else if(menuChoice ==2) {
			WineMenu winemenu = new WineMenu();
			PrintWineMenu prntwnmnu = new PrintWineMenu(winemenu);
			
			prntwnmnu.printMenu();
		}
		
		else if(menuChoice == 3) {
			System.out.print("Place holder for liquor menu");
			//place holder for liquor menu
		}
		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.posStatus(context);
		}
		
		Context context = new Context();
		
		FollowUpState followUp = new FollowUpState();
		followUp.posStatus(context);
	}
}
