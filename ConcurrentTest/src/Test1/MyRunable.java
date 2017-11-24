package Test1;

public class MyRunable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("123");
	}
	public static void main(String[] args) {
		MyRunable myRunable=new MyRunable();
		Thread thread=new Thread(myRunable);
		thread.start();
	}

}
