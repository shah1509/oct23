package pkg_01;

public class cls_01 {

	String a;
	int b;
	public void display1() {
		System.out.println("my name is akash shah");
	}
	public void display2() {
		System.out.println("I will be automation test engineer");
	}
	
	public static void main(String[] args) {
		cls_01 obj = new cls_01();
		obj.display1();
		obj.display2();
		obj.a="akash shah";
		System.out.println(obj.a);
		obj.b=31;
		System.out.println(obj.b);
	}
	
	
}
