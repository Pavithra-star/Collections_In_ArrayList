import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeList implements Serializable {
	private int eid;
	private String ename;
	private double esalary;

	public EmployeeList(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

	public static void main(String[] args) {
		List<EmployeeList> list = new ArrayList<EmployeeList>();
		list.add(new EmployeeList(8, "pavani", 67.000));
		list.add(new EmployeeList(2, "rahul", 45.000));
		list.add(new EmployeeList(7, "sridevi", 23.000));
		list.add(new EmployeeList(5, "anudeep", 12.000));
		// list.stream().filter(x->x.getSalary).forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(EmployeeList::getEid)).forEach(System.out::println);

	}

}