package test;
public class Test {
	public static void main(String[] args) {
		double a, b, c, d, e, f, max, min;
		a = 10.1;
		b = 20.1;
		c = -3.2;
		d = -8.0;
		e = 9.7;
		f = 0.0;
		
		Double[] dArr = new Double[] {a,b,c,d,e,f}; 
		max = dArr[0];
		min = dArr[0];
		
		for(int i = 0; i < dArr.length; i++) {
			if(max < dArr[i]) max = dArr[i];
			if(min > dArr[i]) min = dArr[i];
		}
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.printf("%05d", 10);
		
		int num = 1615;
		System.out.printf("%o",num);
	}
}
