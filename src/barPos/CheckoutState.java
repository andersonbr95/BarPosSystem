package barPos;

import java.util.Scanner;

public class CheckoutState implements State{

	@Override
	public void posStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner usrInpt = new Scanner(System.in);
		BeerMenu beerCashOutMenu = new BeerMenu();
		WineMenu wineCashOutMenu = new WineMenu();
		
		System.out.print("This is a current place holder for the checkout state.");
		
		FollowUpState followUp = new FollowUpState();
		followUp.posStatus(context);
		context.setState(this);
	}

}
