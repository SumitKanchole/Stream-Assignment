//assignment done till j
package stream1;
import java.util.*;
class University {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public University(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
public class T2 {

	public static void main(String[] args) {
		ArrayList <University> l = new ArrayList <University>();
		l.add(new University("animesh",20));
		l.add(new University("rahul",25));
		l.add(new University("pankaj",21));
		l.add(new University("durgesh",27));
		l.add(new University("aman",24));
		l.add(new University("divyansh",10));
		l.add(new University("ravi",35));
		l.add(new University("abhishek",29));
		l.add(new University("amit",22));
		
		System.out.println("youngest Student >>> ");
		Optional <University> l2  = l.stream().min((x,y)->{ return x.getAge().compareTo(y.getAge());});
		if(l2.isPresent()) {
			System.out.println(l2.get());
		}
		
		System.out.println("Oldest Student >>> ");
		Optional <University> l3  = l.stream().max((x,y)->{ return x.getAge().compareTo(y.getAge());});
		if(l3.isPresent()) {
			System.out.println(l3.get());
		}
	}

}
