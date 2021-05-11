import java.util.ArrayList;
import java.util.List;

public class ArraList_CrudOperations {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("Size of the array= " + (list.size()));
		list.add(10);
		list.add(true);
		list.add("ojas");
		list.add('c');
		list.add(10);// duplicate its allows
		System.out.println("Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Object x : list) {
			System.out.println(x);
		}
	}

}
