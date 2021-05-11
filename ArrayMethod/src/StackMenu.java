import java.util.Scanner;
public class StackMenu {
	static int top=-1;
	static int size = 5;
	static int stack[] = new int[size];
	static void menu() {
		String str ="Menu driven application\n";
		str += "1.push\n";
		str += "2.pop\n";
		str += "3.DisplayElements\n";
		str += "4.Exit\n";
		str += "Selection any option\n";
		System.out.println(str);
	}
	static boolean isFull() {
		boolean b= false ;
		if(top == size-1) {
			b=true;
		}
		return b;
	}
	static boolean isEmpty() {
		boolean b= false;
		if(top==-1) {
			b= true ;
		}
		return b;
	}
	static void push(int element) {
		if(!isFull()) {
			stack [++top] =element ;
			System.out.println("Added element to stack ");
		}
		else {
			System.out.println("stack is full");
		}
	}
	static void pop() {
		if(!isEmpty()) {
			System.out.println("deleted element is="+stack[top]);
			top--;
		}
		else {
			System.out.println("stack is empty");
		}
	}
	static void display() {
		if(!isEmpty()) {
			System.out.println(("stack elements are follows"));
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]);
			}
		}
		else {
			System.out.println("no elements in the stack");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Eneter  any value");
				push(sc.nextInt());
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid operator");
			}//switch closing
		}//while closing

	}//method closing
}//class
