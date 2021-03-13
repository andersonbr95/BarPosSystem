package barPos;

public class printAllMenus {
	
	
	public printAllMenus() {
		
		BeerMenu beerMenu = new BeerMenu();
		PrintBeerMenu prntBrMnu = new PrintBeerMenu(beerMenu);
		WineMenu wineMenu= new WineMenu();
		PrintWineMenu prntWnMnu= new PrintWineMenu(wineMenu);
		LiquorMenu liquorMenu = new LiquorMenu();
		printLiquorMenu prntlqrMnu = new printLiquorMenu(liquorMenu);
		
		prntBrMnu = new PrintBeerMenu(beerMenu);
		prntWnMnu = new PrintWineMenu(wineMenu);
		prntlqrMnu = new printLiquorMenu(liquorMenu);
		
	}
	
	
	public void printBeerMenu() {
		BeerMenu beerMenu = new BeerMenu();
		PrintBeerMenu prntBrMnu = new PrintBeerMenu(beerMenu);
		prntBrMnu.printMenu();
	}
	
	public void printWineMenu() {
		WineMenu wineMenu= new WineMenu();
		PrintWineMenu prntWnMnu= new PrintWineMenu(wineMenu);
		prntWnMnu.printMenu();
	}
	public void printLiquorMenu() {
		LiquorMenu liquorMenu = new LiquorMenu();
		printLiquorMenu prntlqrMnu = new printLiquorMenu(liquorMenu);
		prntlqrMnu.printMenu();
	}

	
}
