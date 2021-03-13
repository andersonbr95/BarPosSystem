package barPos;

public class BeerMenu {
	int numberOfItems = 0;
	Beer[] beerMenu;
	
	public BeerMenu() {
		
		beerMenu = new Beer[6];
		
		beerMenu[0] = new BudLight();
		beerMenu[1] = new MillerLite();
		beerMenu[2] = new ThreeOneTwo();
		beerMenu[3] = new Heineken();
		beerMenu[4] = new AntiHero();
	}
	
	public Iterator createIterator() {
		return new BeerMenuIterator(beerMenu);
	}
}
