import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraListDemo {

	public static void main(String[] args) {
	//	List<String> list=Arrays.asList("pavithra","Radha");
//		Stream<String> s=list.stream();
//		List<String> l=s.map(x -> 
//		x.toUpperCase()).
//		collect(Collectors.toList());
//l.forEach(x -> System.out.println(x));
//		Stream<String> s=list.stream().sorted();
//		s.forEach(x-> System.out.println(x));
		Integer num[]=new Integer[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 sub marks?");
		for(int i=0 ; i< num.length; i++) {
			num[i] =sc.nextInt();
		}
		Stream<Integer> inStream = Stream.of(num);
		inStream = inStream.sorted();
		inStream.forEach(System.out::println);
 	}

}
