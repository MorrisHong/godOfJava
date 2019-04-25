package c15.string;

public class StringCompare {
	public static void main(String[] args) {
		StringCompare sample = new StringCompare();
		
		String addresses[] = new String[] {
				"서울시 구로구 신도림동",
				"경기도 성남시 분당구 정자동",
				"서울시 구로구 개봉동"
		};
		sample.containsAddress(addresses);
		
		
	}
	public void containsAddress(String[] addresses) {
		int containCount = 0;
		String containText = "구로구";
		for(String text : addresses) {
			if(text.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("contains " + containText+ " count is "+containCount );
	}
	public void checkAddress(String[] addresses) {
		int startCount = 0, endCount = 0;
		String startText = "서울시";
		String endText = "동";
		for(String text : addresses) {
			if(text.startsWith(startText)) {
				startCount++;
			}
			if(text.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Starts with "+startText+" count is "+startCount);
		System.out.println("ends with "+endText+" count is "+endCount);
	}
	public void checkString() {
		String text ="You must know String class.";
		System.out.println("text.length() : "+text.length());
		System.out.println("text.isEmpty() : "+text.isEmpty());
	}
	public void checkCompare() {
		String text = "Check value";
//		String text2 = "Check value";
		String text2 = new String("Check value");
		if(text == text2) {
			System.out.println("text == text2 result is same. ");
		}else {
			System.out.println("text == text2 result is different. ");
		}
		
		if(text.equals(text2)) {
			System.out.println("text.equals(text2) result is same. ");
		}
	}
	public void checkCompareTo() {
		String text = "a";
		String text2 = "b";
		String text3 = "c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
	}
}
