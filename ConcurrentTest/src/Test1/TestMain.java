package Test1;

public class TestMain extends Thread {
	public TestMain(String name) {
		super(name);
	}

	private int m;

	public static void main(String[] args) {
		TestMain obj = new TestMain("hhaha");
		obj.m = 9;
		f(obj);
		f1(obj);
	}

	public static void f(TestMain m) {
		System.out.println(m.m);
		m.m = 6;
		System.out.println(m.m);
		//m.m = 8;
	}

	public static void f1(TestMain m) {

		m.m = 3;
	}
}
