import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
class House {
	private int id;
	private String location;
	private double rent;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public House(int id, String location, double rent) {
		super();
		this.id = id;
		this.location = location;
		this.rent = rent;

	}
	@Override
	public String toString() {
		return rent+" ";
	}
	
}
public class S5 {

	public static void main(String[] args) {
		ArrayList <House> l = new ArrayList <House>();
		l.add(new House(101,"indore",500));
		l.add(new House(102,"bhopal",750));
		l.add(new House(103,"jaipur",850));
		l.add(new House(104,"chennai",600));

        Function <House,House> f = x->{
                double increment = (x.getRent()*5)/100; 
                x.setRent(x.getRent()+increment); 
                return x;
        };
        List <House> l1 = l.stream().map(f).collect(Collectors.toList());

        System.out.print("Updated Rent amounts : ");
        System.out.println(l1);

    }

}
