import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetList {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("radha");
		tree.add("radha");
		tree.add("aadhya");
		tree.add("radha");
		tree.add("aadhya");
		tree.add("anil");
		//Collections.sort(tree);
//		tree.forEach(System.out::println);
//		System.out.println(tree);
	}

}
//i want display descending order
class NameSorting implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
