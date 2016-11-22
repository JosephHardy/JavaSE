package Task12;

public class Battleship {
	public static void main(String[] args){
		// Generate grids and ships
		Grid Player1 = new Grid();
		Grid Player2 = new Grid();
		Ship P1D1 = new Ship();
		Ship P1D2 = new Ship();
		Ship P2D1 = new Ship();
		Ship P2D2 = new Ship();
		
		// Initialise grids
		Player1.initGrid();
		Player2.initGrid();
		
		// Add ships
		Player1.addShip(P1D1, 0, 0, true);
		Player2.addShip(P2D1, 0, 0, false);
		Player1.addShip(P1D2, 2, 0, false);
		Player2.addShip(P2D2, 0, 2, true);
		
		// Print grids
		Player1.print();
		Player2.print();
	}
}
