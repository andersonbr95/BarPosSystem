package barPos;

public class ViewDrinkMenuState implements State{
	public void posStatus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
	}
}
