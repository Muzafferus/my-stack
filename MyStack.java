import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStack {
	static int i = 0;
	static Integer[] list = new Integer[0];

	public MyStack() {
	}

	public boolean isEmpty() {
		boolean empty = true;
		for (Integer item : list) {
			if (item != null) {
				empty = false;
				break;
			}
		}
		return empty;
	}

	public void push(Integer item) {

		Integer[] oldList = new Integer[i];
		for (int j = 0; j < list.length; j++) {
			oldList[j] = list[j];
		}

		i++;
		list = new Integer[i];

		for (int j = 0; j < oldList.length; j++) {
			list[j] = oldList[j];
		}

		list[i - 1] = item;
	}

	public Integer peek() {
		return list[list.length - 1];
	}

	public Integer pop() {

		Integer lastItem = list[list.length - 1];

		Integer[] oldList = new Integer[i];
		for (int j = 0; j < list.length; j++) {
			oldList[j] = list[j];
		}

		i--;
		list = new Integer[i];

		for (int j = 0; j < oldList.length - 1; j++) {
			list[j] = oldList[j];
		}

		return lastItem;
	}

	public int search(Integer item) {
		boolean search = false;
		int index = 0;
		for (int j = 0; j < list.length; j++) {
			if (item.equals(list[j])) {
				index = j;
				search = true;
			}
		}
		if (!search) {
			return -1;
		} else {
			return (index + 1);
		}
	}

	public String toString() {
		String res = Arrays.toString(list);
		return res;
	}
}
