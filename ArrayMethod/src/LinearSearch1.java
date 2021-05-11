import java.util.Scanner;
public class LinearSearch1 {
	
static String indexValue(int search,int searchElement[]) {
	int count=0;
	String str="";
	int i;
	for (i=0 ;i<=searchElement.length; i++) {	
		if(search==searchElement[i]) {
			count++;
			break;
		}	
	}
	if(count!=0) {
		str +="Element is found at the ondex of "+(i+1);	
	}
	else
	{
		str += "not found";
	}
	return str;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {12,23,34,45};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a element");
		System.out.println(indexValue(sc.nextInt(),numbers));
	}
}
