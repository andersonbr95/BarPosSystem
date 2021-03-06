package barPos;

public class BeerMenuIterator implements Iterator{
	
	Beer[] beerMenu;
	int position;
	
	public BeerMenuIterator(Beer[] beerMenu) {
		this.beerMenu = beerMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > beerMenu.length || beerMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Beer next() {
		
		Beer beerMenuPos = (Beer) beerMenu[position];
		position = position +1;
		
		return beerMenuPos;
	}

}
