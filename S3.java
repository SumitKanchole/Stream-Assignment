import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int id, String name, int age, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + salary + ", department="
				+ department + "]\n";
	}
	
	
}
public class S3 {

	public static void main(String[] args) {
		ArrayList <Employee> l = new ArrayList <Employee>();
		l.add(new Employee(101,"Animesh",20,45000,"computer science"));
		l.add(new Employee(102,"durgesh",25,75000,"Marking"));
		l.add(new Employee(103,"yogendra",21,85000,"Management"));
		l.add(new Employee(104,"pankaj",22,69000,"Human Resources"));
		l.add(new Employee(105,"ravi",44,66000,"IT"));
		l.add(new Employee(106,"Aman",19,88000,"BioTechnology"));
		l.add(new Employee(107,"rahul",25,35000,"IT"));
		l.add(new Employee(108,"devendra",35,45000,"Sales"));
		l.add(new Employee(108,"Manish",20,65000,"IT"));

        System.out.println("Employees who have a salary greater than 50000 >>> ");

        List <Employee> l1 = l.stream().filter(x-> x.getSalary()>50000).collect(Collectors.toList());
        System.out.println(l1);

        System.out.println("Employees who belongs to IT department >>> ");

        List <Employee> l2 = l.stream().filter(x-> x.getDepartment().equals("IT")).collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("Employees who are older than 30 years >>> ");

        List <Employee> l3 = l.stream().filter(x-> x.getAge()>30).collect(Collectors.toList());
        System.out.println(l3);
        
        System.out.println("Employees whose names start with 'M' >>> ");
        
        List <Employee> l4 = l.stream().filter(x-> x.getName().startsWith("M")).collect(Collectors.toList());
        System.out.println(l4);
    }

}
