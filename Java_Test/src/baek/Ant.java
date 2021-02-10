package baek;

public class Ant {
	public int x;
	public int y;
	public int[][] array;
	
	public Ant(int[][] array, int x, int y) {
		this.x = x;
		this.y = y;
		this.array = array;
	}
	
	public void change(int nx, int ny) {
		array[nx][ny] = 9;
	}
	
	public void move() {
		int nx = this.x;
		int ny = this.y;
		change(nx, ny);
		while(true) {
			if(array[nx][ny+1] == 1) {
				nx++;
				change(nx, ny);
			}
			else if(array[nx][ny+1] == 0) {
				ny++;
				change(nx, ny);
			}
			if(array[nx+1][ny] == 2) {
				change(nx+1, ny);
				break;
			}
			else if(array[nx][ny+1] == 2) {
				change(nx, ny+1);
				break;
			}
		}
	}
}
