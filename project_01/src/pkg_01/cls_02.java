package pkg_01;

public class cls_02 {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}	
	public int minus(int y, int z) {
		int x = y-z;
		return x;
	}
	public int multi(int q, int r) {
		int p = q*r;
		return p;
	}
	public void div(int n, int o) {
		int m=n/o;
		System.out.println("final test result is " + m);
	}
	
	public static void main(String[] args) {
		cls_02 obj = new cls_02();
		int sum1 = obj.add(10, 2);
		int sum2 = obj.add(sum1, 2);
		int sub = obj.minus(sum2, 2);
		int mul = obj.multi(sub, 2);
		obj.div(mul, 2);		
		
		
	}

}
