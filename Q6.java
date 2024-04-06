package Q6;

import java.util.*;
class Animal{
	String name,color,type;
	public Animal(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public int hashCode() {
		return Objects.hash(name,color,type);
	}

	
	
}
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Animal cat=new Animal("NAME1","COLOR1","pet");
		Animal wolf=new Animal("NAME2","COLOR2","wild");
		System.out.println("Cat's hashcode: " +cat.hashCode());
		System.out.println("Wolf's hashcode: " +wolf.hashCode());
		

	}

}