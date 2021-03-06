package barPos;

public class WineMenuIterator implements Iterator{

	Wine[] wineMenu;
	int position;
	
	public WineMenuIterator(Wine[] wineMenu) {
		this.wineMenu = wineMenu;
	}
	@Override
	public boolean hasNext() {
		if(position > wineMenu.length || wineMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Wine next() {
		Wine wineMenuPos = (Wine) wineMenu[position];
		position = position +1;
		
		return wineMenuPos;
	}

}
