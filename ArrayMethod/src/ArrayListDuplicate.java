
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Arun", "Shyam", "Arun", "Rahul");

//		        Stream<String> s = list.stream();
//		        List<String> l = s.map(x->x.toUpperCase())
//		                .collect(Collectors.toList());
//		        l.forEach(x->System.out.println(x));

//		        Stream<String> s = list.stream().sorted();
//		        s.forEach(x->System.out.println(x));

		// print 5 sub marks
//		        Integer num[] = new Integer[5];
//		        Scanner sc = new Scanner(System.in);
//		        System.out.println("Enter 5 sub marks?");
//		        for(int i=0; i < num.length;i++) {
//		            num[i] = sc.nextInt();
//		        }
//		        Stream<Integer> intStream = Stream.of(num);
//		        intStream = intStream.sorted();
//		        intStream.forEach(System.out::println);
		Stream<String> s = list.stream().distinct();
		s.forEach(x -> System.out.println(x));
	}

}
