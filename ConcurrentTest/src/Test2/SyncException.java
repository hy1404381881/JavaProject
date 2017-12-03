package Test2;

public class SyncException {

	private int i = 0;

    public synchronized void operation() {
        while (true) {
            i++;
            System.out.println(Thread.currentThread().getName() + " , i= " + i);
            if (i == 10) {
                Integer.parseInt("a");
            }
            System.out.println(11);
        }
    }

    public static void main(String[] args) {
        final SyncException se = new SyncException();
        new Thread(new Runnable() {
            public void run() {
                se.operation();
            }
        }, "t1").start();
    }
}
