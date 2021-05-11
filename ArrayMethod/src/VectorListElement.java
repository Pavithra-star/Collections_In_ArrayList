import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;

public class VectorListElement {
	public Vector<Integer> dispEvenNos(int startValue,int endValue){
		Vector<Integer> v=new Vector<Integer>();
		for(int i=startValue ; i<= endValue ; i++) {
		if(i % 2 == 0) {
			v.addElement(i);
		}
		}
		return v;
		}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers i.e start and endvalue");
		int s=sc.nextInt();
		int e=sc.nextInt();
		
		VectorListElement obj=new VectorListElement();
		Vector<Integer> v=obj.dispEvenNos(s,e);
		v.forEach(x->System.out.println(x));
		//Vector<Integer> v=new Vector<Integer>();
//for(int i=0; i<=100;i++) {
//	if(i%2==0) {
//	System.out.println(i);
//}

	}

}

