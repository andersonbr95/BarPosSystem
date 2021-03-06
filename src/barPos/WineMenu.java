package barPos;

public class WineMenu {
	int numberOfItems = 0;
	Wine[] wineMenu;
	
	public WineMenu() {
		
		wineMenu = new Wine[6];
		
		wineMenu[0] = new Moscato();
		wineMenu[1] = new RedBlend();
	}
	
	public Iterator createIterator() {
		
		return new WineMenuIterator(wineMenu);
	}
}
