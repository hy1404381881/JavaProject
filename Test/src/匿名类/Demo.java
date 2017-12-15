package 匿名类;

import sun.net.www.content.text.plain;

abstract class Person {
	public void name() {
		System.err.println("fdfdf");
	}

	public void name2() {
		System.out.println("eeeee");
	}
}

public class Demo {
	public static void main(String[] args) {
		Person p = new Person() {
			public void name() {
				System.err.println("ggggggggg");
			}

			public void name2() {
				System.out.println("hhhhhhhhhhhhhhhhhhhh");
			}
		};
		p.name();
		p.name2();
	}
	
}
