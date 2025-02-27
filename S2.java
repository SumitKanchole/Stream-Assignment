package stream;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
class Student {
	private int id;
	private String name;
	private int age;
	private double marks;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student(int id, String name, int age, double marks, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", department="
				+ department + "]\n";
	}
	
	
}
public class S2 {

	public static void main(String[] args) {
		ArrayList <Student> l = new ArrayList <Student>();
		l.add(new Student(101,"Animesh",20,45,"computer science"));
		l.add(new Student(102,"durgesh",25,75,"Commerce"));
		l.add(new Student(103,"yogendra",21,85,"Management"));
		l.add(new Student(104,"pankaj",22,69,"Human Resources"));
		l.add(new Student(105,"ravi",24,66,"computer science"));
		l.add(new Student(106,"Aman",19,88,"BioTechnology"));
		l.add(new Student(107,"rahul",25,35,"Management"));
		l.add(new Student(108,"devendra",20,45,"Sales"));

        System.out.println("Students who have marks greater than 75 >>> ");

        List <Student> l1 = l.stream().filter(x-> x.getMarks()>75).collect(Collectors.toList());
        System.out.println(l1);

        System.out.println("Students who belongs to computer science department >>> ");

        List <Student> l2 = l.stream().filter(x-> x.getDepartment().equals("computer science")).collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("Students who are older than 20 years >>> ");

        List <Student> l3 = l.stream().filter(x-> x.getAge()>20).collect(Collectors.toList());
        System.out.println(l3);
        
        System.out.println("Students whose names start with 'A' >>> ");
        
        List <Student> l4 = l.stream().filter(x-> x.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println(l4);
    }

}
