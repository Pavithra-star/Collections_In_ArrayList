import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraListReverse {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(34);
		list.add(1);
		list.add(1);
		Collections.sort(list,Collections.reverseOrder());
		Set<Integer> set=new HashSet<Integer>(list);
		//list.forEach(System.out::println);
		set.forEach(System.out::println);
	}

	

}
