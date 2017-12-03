package Test2;

public class StringLock {
	private String lock = "lock";

    public void method() {
        synchronized (lock) {
            try {
                System.out.println("��ǰ�̣߳� " + Thread.currentThread().getName() + "��ʼ");
                Thread.sleep(1000);
                System.out.println("��ǰ�̣߳� " + Thread.currentThread().getName() + "����");
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        final StringLock stringLock = new StringLock();
        new Thread(new Runnable() {
            public void run() {
                stringLock.method();
            }
        }, "t1").start();

        new Thread(new Runnable() {
            public void run() {
                stringLock.method();
            }
        }, "t2").start();
    }

}
