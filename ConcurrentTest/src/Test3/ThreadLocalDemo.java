package Test3;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ThreadLocalDemo {
	 public static ThreadLocal<List<String>> threadLocal = new ThreadLocal<>();

	    public void setThreadLocal(List<String> values) {
	        threadLocal.set(values);
	    }

	    public void getThreadLocal() {
	        System.out.println(Thread.currentThread().getName());
	        //threadLocal.get().forEach(name -> System.out.println(name));
	        List<String> varList=this.threadLocal.get();
	        for (String string : varList) {
				System.err.println(string);
			}
	    }

	    public static void main(String[] args) throws InterruptedException {

	        final ThreadLocalDemo threadLocal = new ThreadLocalDemo();
	        new Thread(() -> {
	            List<String> params = new ArrayList<>(3);
	            params.add("张三");
	            params.add("李四");
	            params.add("王五");
	            threadLocal.setThreadLocal(params);
	            threadLocal.getThreadLocal();
	        }).start();

	        new Thread(() -> {
	            try {
	                Thread.sleep(1000);
	                List<String> params = new ArrayList<>(2);
	                params.add("Chinese");
	                params.add("English");
	                threadLocal.setThreadLocal(params);
	                threadLocal.getThreadLocal();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }).start();
	    }

}
