
public class ArrayLinearMethod {
static int indexValue(int[] arr,int key) {
	String str="";
	for (int i = 0 ; i<=arr.length; i++) {
		if (arr[i]==key) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int[] a1= {10,20,30,40,50};
		int key = 50;
System.out.println("found in  \n" +indexValue(a1,key));
	}
	

}
