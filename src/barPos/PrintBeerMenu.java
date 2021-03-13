package barPos;

public class PrintBeerMenu implements printMenus{
	BeerMenu beerMenu;
	Beer beer;
	
	public PrintBeerMenu(BeerMenu beerMenu) {
		this.beerMenu = beerMenu;
	}
	
	public void printMenu() {
		Iterator iterateBeerMenu = beerMenu.createIterator();
		printMenu(iterateBeerMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------BEER MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			  Beer beer = (Beer) iterator.next();
			  
			  System.out.print(beer.getDrinkName() + "\t");
			  System.out.print(beer.getBrewery()+"\t");
			  System.out.println(" $"+beer.getCost()+"\n");
			
		}
		 
	}
}
