package Q1;
class Student<T>{
	public Student(String name, T roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	String name;
	T roll;
	int age;
	void printdetails() {
		System.out.println("NAME:- "+this.name+" ROLL NO:- "+this.roll+" AGE:- "+this.age);
	}
	public boolean equals(Object o) {
		Student<T> oth=(Student<T>)o;
		if(this.roll.equals(oth.roll)) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Q1 {

	public static void main(String[] args) {
		Student<Integer>s1=new Student<Integer>("N1",1,20);
		s1.printdetails();
		Student<String>s2=new Student<String>("N2","2",20);
		s2.printdetails();
		Student<Integer>s3=new Student<Integer>("N3",3,20);
		s3.printdetails();
		System.out.println(s2.equals(s3));
	}

}
