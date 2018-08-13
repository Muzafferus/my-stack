import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {
	List<E> list = new ArrayList<>();
	
	public MyStack() {
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E item) {
		list.add(item);
	}

	public E peek() {
		return list.get(list.size() - 1);
	}

	public E pop() {
		E item = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return item;
	}

	public int search(E item) {
		
		int index = list.indexOf(item);
		if(index == -1) {
			return index;
		}
		return (index + 1);
	}
	
	public String toString() {
		return list.toString();
	}
}
