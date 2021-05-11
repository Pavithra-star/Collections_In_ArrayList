import java.util.Scanner;
public class QueueDemo1 {
static int rear =0;
static int front =0;
static int size =5;
static int queue[]=new int [size];
static void menu() {
String m =" Menu Driven Application\n";
m +="1.Insertion\n";
m +="2.Delete\n";
m +="3.DisplayElement\n";
m +="4.Exit\n";
m +="Selection any option\n";
System.out.println(m);
}
static boolean isFull() {
	boolean b=false;
	if(rear == size) {
		b=true;
	}
	return b;
}
static boolean isEmpty() {
	boolean b= false;
	if(front== rear) {
	b= true;
}
	return b;
}
static void insert(int element) {
	if(!isFull()) {
		queue[rear]=element;
		System.out.println("adda element to queue\n");
		rear ++;
	}
	else {
		System.out.println("queue is full");
	}
	}
static void delete() {
	if(!isEmpty()) {
		System.out.println("deleted elementis="+queue[front]);
		for(int i=0;i<=rear-1 ;i++) {
			queue[i]= queue[i+1];
		}
		rear--;
	}
	else {
		System.out.println("queue is empty");
	}
}
static void display() {
	if(!isEmpty()) {
		System.out.println("queue elements are as follow");
				for (int i=front ; i< rear; i++) {
				System.out.println(queue[i]);
	} 
}
	else {
		System.out.println("no elemets in the queue");
	}
}
	public static void main(String[] args) {
		
Scanner sc=new Scanner (System.in);
while(true) {
	menu();
	int choice =sc.nextInt();
	switch(choice) {
	case 1: System.out.println("enter any value");
	insert(sc.nextInt());
	break;
	case 2:
		delete();
		break;
	case 3:
		display();
		break;
	case 4:
		System.exit(0);;break;
		default:
			System.out.println("Invalid otpion");
	}//switch
}//while
	}//main 

}//class
