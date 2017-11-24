import com.sun.org.apache.bcel.internal.generic.NEW;

public class Util {
	 public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
	        return p1.getKey().equals(p2.getKey()) &&
	               p1.getValue().equals(p2.getValue());
	    }
	 public static void main(String[] args) {
		 Object object=new Object();
		 Pair<Integer, Object> p1 = new Pair<Integer, Object>(1, "aaaaa");
		 Pair<Integer, Object> p2 = new Pair<Integer, Object>(1, "aaaaa");
		 boolean same = Util.compare(p1, p2);
		 System.out.println(same);
	}
}
