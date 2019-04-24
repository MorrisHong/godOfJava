package ch8;

public class StaticBlock {
	static int data = 1;
	public StaticBlock() {
		System.out.println("StaticBlock Constructor.");
	}
	
	static {
		System.out.println("*** First static block. ***");
		data = 3;
	}
	
	static {
		System.out.println("*** Second static block. ***");
	}
	public static int getData() {
		return data;
	}
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		System.out.println(sb.getData());
//		System.out.println(StaticBlock.getData());
	}
}
