import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
class Product {
	private int id;
	private String name;
	private double price;

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
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;

	}
	@Override
	public String toString() {
		return price+" ";
	}
	
	
}
public class S4 {

	public static void main(String[] args) {
		ArrayList <Product> l = new ArrayList <Product>();
		l.add(new Product(101,"abc",4500));
		l.add(new Product(102,"xyz",7500));
		l.add(new Product(103,"www",8500));
		l.add(new Product(104,"rrr",6900));
	
        System.out.println("increase the price of each product by 15% >>> ");

        Function <Product,Product> f = x->{
                double increment = (x.getPrice()*15)/100; 
                x.setPrice(x.getPrice()+increment); 
                return x;
        };
        List <Product> l1 = l.stream().map(f).collect(Collectors.toList());

        System.out.print("Updated Prices : ");
        System.out.println(l1);

      
        
       
    }

}
