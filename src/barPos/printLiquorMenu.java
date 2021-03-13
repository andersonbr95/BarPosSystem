package barPos;

public class printLiquorMenu implements printMenus{
	LiquorMenu liquorMenu;
	Liquor liquor;
	
	public printLiquorMenu(LiquorMenu liquorMenu) {
		this.liquorMenu = liquorMenu;
	}
	
	public void printMenu() {
		Iterator iterateLiquorMenu = liquorMenu.createIterator();
		printMenu(iterateLiquorMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------LIQUOR MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			  Liquor liquor = (Liquor) iterator.next();
			  
			  System.out.println(liquor.getDrinkName() + "\t"+
			  liquor.getDistillery()+"\t"
			  + " $"+liquor.getCost()+"\n");
			
		}
		 
	}

}
