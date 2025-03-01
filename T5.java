package stream1;
import java.util.*;
import java.util.stream.Collectors;
class UniversityStudent{
	private String name;
	private int age;
	private int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public UniversityStudent(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]\n";
	}
	
	
}
public class T5 {

	public static void main(String[] args) {
		ArrayList <UniversityStudent> l = new ArrayList <UniversityStudent>();
		l.add(new UniversityStudent("animesh",20,34));
		l.add(new UniversityStudent("rahul",25,44));
		l.add(new UniversityStudent("pankaj",21,65));
		l.add(new UniversityStudent("durgesh",27,76));
		l.add(new UniversityStudent("aman",24,56));
		l.add(new UniversityStudent("divyansh",15,21));
		l.add(new UniversityStudent("ravi",35,88));
		l.add(new UniversityStudent("abhishek",29,99));
		l.add(new UniversityStudent("amit",22,77));
		
		List <UniversityStudent> l1 = l.stream().filter(x->x.getMarks()>50).collect(Collectors.toList());
		System.out.println(l1);
		
		

	}

}
