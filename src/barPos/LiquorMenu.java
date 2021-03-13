package barPos;

public class LiquorMenu {
	int numberOfItems = 0;
	Liquor[] liquorMenu;
	
	public LiquorMenu() {
		
		liquorMenu = new Liquor[4];
		liquorMenu[0] = new KnobCreek();
		liquorMenu[1] = new Titos();
		liquorMenu[2] = new Aviation();
	}
	
	public Iterator createIterator() {
		return new LiquorMenuIterator(liquorMenu);
	}
}
