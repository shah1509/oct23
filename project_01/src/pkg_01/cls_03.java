package pkg_01;

public class cls_03 {
	
	public int multi(int b, int c) {
		int a = b*c;
		System.out.println("result of multiplication is "+a);
		return a;
	}
	public int sum(int y, int z) {
		int x = y+z;
		System.out.println("result of addition is "+x);
		return x;
	}
	public int sub(int n, int o) {
		int m = n-o;
		System.out.println("result of substraction is "+m);
		return m;
	}
	public void div(int q, int r) {
		int p = q/r;;
		System.out.println("final result is "+p);
	}

	public static void main(String[] args) {
		cls_03 obj = new cls_03();
		int mul = obj.multi(10, 2);
		int add = obj.sum(mul, 2);
		int sub1 = obj.sub(add, 2);
		int sub2 = obj.sub(sub1, 2);
		obj.div(sub2, 2);	
		
		
	}
	
}
