package Test5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
	public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        //lambda写法
        new Thread(() -> runMethod(lock), "thread1").start();
        new Thread(() -> runMethod(lock), "thread2").start();
        new Thread(() -> runMethod(lock), "thread3").start();
        new Thread(() -> runMethod(lock), "thread4").start();
        //常规写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                runMethod(lock);
            }
        }, "thread5").start();
    }

    private static void runMethod(Lock lock) {
        lock.lock();
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadName:" + Thread.currentThread().getName() + (" i=" + i));
        }
        System.out.println();
        lock.unlock();
    }
}
