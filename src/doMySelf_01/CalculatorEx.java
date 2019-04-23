package doMySelf_01;

public class CalculatorEx {
	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		int num1 = 10;
		int num2 = 5;
		System.out.println(cal.subtract(num1, num2));
		System.out.println(cal.multiply(num1, num2));
		System.out.println(cal.divide(num1, num2));
	
	
	}
	
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}
