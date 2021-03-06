package barPos;

public class PrintWineMenu {
	WineMenu wineMenu;
	Wine wine;
	
	public PrintWineMenu(WineMenu wineMenu) {
		this.wineMenu = wineMenu;
	}
	
public void printMenu() {
		
		Iterator iterateWineMenu = wineMenu.createIterator();
		
		printMenu(iterateWineMenu);
	}

private void printMenu(Iterator iterator) {
	System.out.println("\n\n\n\n-------------------WINE MENU-------------------\n\n");
	
	while(iterator.hasNext()) {
		
		Wine wine = (Wine) iterator.next();
		
		System.out.print(wine.getDrinkName() + "\t");
		System.out.print(wine.getWinery()+ "\t");
		System.out.println(" $" + wine.getCost()+"\n");
		}
	}
}

