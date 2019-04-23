package doMySelf_07;

public class ManageHeight {
	int[][] gradeHeight;
	
	public static void main(String[] args) {
		ManageHeight mHeight = new ManageHeight();
		for(int i = 1; i <= 5; i++) {
//			mHeight.printHeight(i);
			mHeight.printAverage(i);
		}
	}
	
	ManageHeight(){
		setData();
	}
	
	public void setData() {
		gradeHeight = new int[][]{ { 170, 180, 173, 175, 177 },
						{ 160, 165, 167, 186 },
						{ 158, 177, 187, 176 },
						{ 173, 182, 181},
						{ 170, 180,165, 177, 172} };
	}
	
	public void printHeight(int classNo) {
		System.out.println("Class No. : "+classNo);
		for(int i = 0; i < gradeHeight[classNo - 1].length; i++) {
			System.out.println( gradeHeight[classNo-1][i] );
		}
		System.out.println();
	}
	
	public void printAverage(int classNo) {
		double sum = 0.0;
		for(int i = 0; i < gradeHeight[classNo - 1].length; i++) {
			sum += gradeHeight[classNo - 1][i];
		}
		double avg = sum / gradeHeight[classNo - 1].length;
		
		System.out.println("Class No. : " + classNo);
		System.out.println("Height avg : " + avg);
		
		System.out.println();
	}
}
