import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	int empNo;
	String ename;
	double salary;

	Employee(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public String toString() {
		return empNo + " " + ename + " " + salary;

	}
}

class ListOperations {
	List<Employee> list;

	ListOperations() {
		list = new ArrayList<>();

	}

	void addEmployee(Employee e) {
		list.add(e);
		System.out.println("Added successfully");
		
	}

	void deleteEmployee(int num) {
		list.remove(--num);
		System.out.println("Deleted successfully");
		;
	}

	void updateEmployee(int num, Employee employee) {
		list.set(--num, employee);
		System.out.println("Updated successfully");

	}

	void listEmployees() {
		System.out.println("Employee info");
		for (Employee e : list) {
			System.out.println(e.toString());
		}
	}

	void menu() {
		String m = "Menu driven Application\n";
		m += "1.Add statement\n";
		m += "2.delete data\n";
		m += "3.update data\n";
		m += "4.List data\n";
		m += "5.Exit\n";
		m += "Select any option?";
		System.out.println(m);
	}

	public void accept() {
		System.out.println(" Enter  your no , name, salary  ");

	}

}

public class EmployeeMenu_DataBase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ListOperations obj = new ListOperations();
		for (;;) {
			obj.menu();
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				obj.accept();
				obj.addEmployee(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
				break;
			case 2:
				System.out.println("Enter your num to delete?");
				obj.deleteEmployee(sc.nextInt());
				break;
			case 3:
				obj.accept();
				int num = sc.nextInt();
				obj.updateEmployee(num, new Employee(num, sc.next(), sc.nextDouble()));
				break;
			case 4:
				System.out.println("Employee info");
				obj.listEmployees();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("invalid option");
				break;
			}// closing switch

		} // closing for loop

	}// closing main
}
