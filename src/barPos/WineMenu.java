package barPos;

public class WineMenu {
	int numberOfItems = 0;
	Wine[] wineMenu;
	
	public WineMenu() {
		
		wineMenu = new Wine[5];
		
		wineMenu[0] = new Moscato();
		wineMenu[1] = new RedBlend();
		wineMenu[2] = new Cabornet();
		wineMenu[3] = new Champagne();
 	}
	
	public Iterator createIterator() {
		
		return new WineMenuIterator(wineMenu);
	}
}
