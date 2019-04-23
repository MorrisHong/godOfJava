package ch6;

public class ControlLabel {
	public static void main(String[] args) {
		ControlLabel control = new ControlLabel();
		control.printTimesTable();
	}
	public void printTimesTable() {
		for(int x = 2; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				System.out.printf("%d * %d = %d%n",x,y,x*y);
			}
		}
	}
}
