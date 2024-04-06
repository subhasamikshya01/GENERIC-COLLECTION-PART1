package q3;
class Car implements Comparable<Car>{
	String m,c;
	int s;
	public Car(String m, String c, int s) {
		super();
		this.m = m;
		this.c = c;
		this.s = s;
	}
	@Override
	public int compareTo(Car o) {
		Car oth=(Car)o;
		if(this.s==oth.s) {
			return 0;
		}
		else if(this.s>oth.s) {
			return 1;
		}
		else {
			return -1;
		}
	}
	public String toString() {
		return "Model:- "+m+" Colour:- "+c+" Speed:- "+s;
	}
	
}
public class q3 {

	public static void main(String[] args) {
		Car c1=new Car("MODEL1","COLOR1",78);
		Car c2=new Car("MODEL2","COLOR2",59);
		int r=c1.compareTo(c2);
		if(r==0) {
			System.out.println("Both the cars have the same speed!");
		}
		else if(r==1) {
			System.out.println("Car having greater speed:-\n"+c1);
		}
		else {
			System.out.println("Car having greater speed:-\n"+c2);
		}
	}

}
