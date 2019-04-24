package ch8;

public class ReferencePass {
	public static void main(String[] args) {
		ReferencePass reference = new ReferencePass();
	
		reference.callPassByValue();
	}
	public void callPassByValue() {
		int a = 10;
		String b = "b";
		System.out.println("before passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
		passByValue(a,b);
		//after passByValue()
		System.out.println("after passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public void passByValue(int a, String b) {
		a = 20;
		b = "z";
		System.out.println("in passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
