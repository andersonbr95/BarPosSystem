package barPos;

public class LiquorMenuIterator implements Iterator {

	Liquor[] liquorMenu;
	int position;
	
	
	public LiquorMenuIterator(Liquor[] liquorMenu) {
		this.liquorMenu = liquorMenu;
	}
	@Override
	public boolean hasNext() {
		if(position > liquorMenu.length || liquorMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Drink next() {
		Liquor liquorMenuPos = (Liquor) liquorMenu[position];
		position = position +1;
		
		return liquorMenuPos;
	}

}
