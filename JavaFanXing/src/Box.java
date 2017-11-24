import com.sun.org.apache.bcel.internal.generic.NEW;

public class Box<T> {
	private T object;
    public Box(T param1) {
    	this.object=param1;
    }
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	public static void main(String[] args) {
		Box<String> box1=new Box<String>("122112");
		Box<Integer> box2=new Box<Integer>(434);
		Box<Object> box3=new Box<Object>(box1);
		System.out.println(box1.object);
		System.out.println(box2.object);
		System.out.println(box3.object);
		
		
	}
}
