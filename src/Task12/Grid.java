package Task12;

public class Grid {
	char[][] grid = new char[3][3];
	boolean[][] ships = new boolean[3][3];
	
	public void initGrid(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				grid[i][j] = ' ';
			}
		}
	}
	
	public void print(){
		for (int i = 0; i < 3; i++){
			System.out.print("-------\n|");
			for (int j = 0; j < 3; j++){
				System.out.print(grid[i][j]);
				System.out.print("|");
			}
			System.out.print("\n");
		}
		System.out.println("-------");
	}
	
	public void addShip(Ship s, int x, int y, boolean h){
		int size = s.size;
		if (h){
			s.horizontal = true;
			try {
				grid[y][x + size - 1] = ' ';
			} catch(Exception e) {
				System.out.println("Ship out of bounds!");
				return;
			}
			for (int i = 0; i < size; i++){
				if (grid[y][x + i] == '*'){
					System.out.println("Ship overlaps another ship!");
					return;
				}
			}
		} else {
			try {
				grid[y + size - 1][x] = ' ';
			} catch(Exception e) {
				System.out.println("Ship overlaps another ship!");
				return;
			}
			for (int i = 0; i < size; i++){
				if (grid[y + i][x] == '*'){
					return;
				}
			}
		}
		for (int i = 0; i < size; i++){
			if (h){
				grid[y][x + i] = '*';
				s.coords[i][0] = y;
				s.coords[i][1] = x + i;
			} else {
				grid[y + i][x] = '*';
				s.coords[i][0] = y + i;
				s.coords[i][1] = x;
			}
		}
	}
}
