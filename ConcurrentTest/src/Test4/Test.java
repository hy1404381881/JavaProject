package Test4;

public class Test {
	 public static void main(String[] args) {
		 MyList myList = new MyList();
	        ThreadB b = new ThreadB(myList);
	        b.setName("B");
	        b.start();
	        ThreadA a = new ThreadA(myList);
	        a.setName("A");
	        a.start();

	       
	    }
}
