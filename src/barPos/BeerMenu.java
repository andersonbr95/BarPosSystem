package barPos;

public class BeerMenu {
	int numberOfItems = 0;
	Beer[] beerMenu;
	
	public BeerMenu() {
		
		beerMenu = new Beer[6];
		
		beerMenu[0] = new BudLight();
		beerMenu[1] = new MillerLite();
	}
	
	public Iterator createIterator() {
		return new BeerMenuIterator(beerMenu);
	}
}
