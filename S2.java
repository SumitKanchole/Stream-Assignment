package stream;
import java.util.*;
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
				+ department + "]";
	}
	
	
}
public class S2 {

	public static void main(String[] args) {
		ArrayList <Student> l = new ArrayList <Student>();
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));
		l.add(new Student(101,"animesh",20,45,"computer science"));

	}

}
