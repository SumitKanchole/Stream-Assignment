import java.util.*;
class University {
private String name;
private int age;
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
@Override
public String toString() {
return "Student [name=" + name + ", age=" + age + "]";
}
public University(String name, int age) {
super();
this.name = name;
this.age = age;
}

}
public class T3 {

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
	  
	System.out.println("youngest Student who are under 18 >>> ");  
	boolean l2  = l.stream().anyMatch(x->x.getAge()<18);  
	System.out.println(l2);  
}

}
