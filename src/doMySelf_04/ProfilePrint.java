package doMySelf_04;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public void setAge(byte age) {
		this.age = age;
	}
	public byte getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setMarried(boolean flag) {
		this.isMarried = flag;
	}
	public boolean isMarried() {
		return this.isMarried;
	}
	
	public static void main(String[] args) {
		ProfilePrint print = new ProfilePrint();
		
		print.setAge((byte) 29);
		print.setMarried(false);
		print.setName("È«Àº¸ð");
		
		System.out.println(print.getAge());
		System.out.println(print.getName());
		System.out.println(print.isMarried());
	}
}
