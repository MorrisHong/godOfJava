package doMySelf_15;

public class UseStringMethod {
	public static void main(String[] args) {
		String str = "The String class represents character strings.";


		UseStringMethod sample = new UseStringMethod();
		sample.printWords(str);
		System.out.println();
		sample.findString(str, "string");
		System.out.println();
		sample.findAnyCaseString(str, "string");
		System.out.println();
		sample.countChar(str, 's');
		System.out.println();
		sample.printContainWords(str, "ss");
		System.out.println();
	}
	public void printContainWords(String str, String findStr) {
		String split[] = str.split(" ");
		for(String tmp : split) {
			if(tmp.contains(findStr)) {
				System.out.println(tmp + " contains "+findStr);
			}
		}
	}
	public void countChar(String str, char c) {
		int count = 0;
		char[] temp = str.toCharArray();
		for(char temp2 : temp) {
			if(temp2 == c) {
				count++;
			}
		}
		System.out.println("char '"+c+"' count is "+count);
	}

	public void printWords(String str) {
		String[] text = str.split(" ");
		for (String tmp : text) {
			System.out.println(tmp);
		}
	}

	public void findString(String str, String findStr) {
		int idx = str.indexOf(findStr);
		if (idx != -1) {
			System.out.println(findStr + " is appeared at " + idx);
		}
	}
	
	public void findAnyCaseString(String str, String findStr) {
		int idx = str.toLowerCase().indexOf(findStr.toLowerCase());
		if(idx != -1) {
			System.out.println(findStr + " is appeared at "+ idx);
		}
	}
	
}
