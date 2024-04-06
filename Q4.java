package Q4;
import java.util.Scanner;
class Student implements Comparable<Student>{
	String name;
	int rn;
	double tm;
	public Student(String name, int rn, double tm) {
		super();
		this.name = name;
		this.rn = rn;
		this.tm = tm;
	}
	@Override
	public int compareTo(Student o) {
		if(this.equals(o)) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public boolean equals(Object o) {
		Student oth=(Student)o;
		if(this.rn==oth.rn) {
			return true;
		}
		else {
			return false;
		}
	}
	public static Student searchStudent(Student key,Student a[]) {
		for(Student k:a) {
			if(key.compareTo(k)==0) {
				return k;
			}
		}
		return null;
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n=sc.nextInt();
		Student a[]=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter name:- ");
			String name=sc.next();
			System.out.print("Enter roll no.:- ");
			int rn=sc.nextInt();
			System.out.print("Enter total mark:- ");
			double tm=sc.nextDouble();
			a[i]=new Student(name,rn,tm);
		}
		System.out.print("Enter the roll number to be searched:- ");
		int rntbs=sc.nextInt();//roll number to be searched.
		Student key=new Student(null,rntbs,0);
		Student r=Student.searchStudent(key,a);
		if(r==null) {
			System.out.println("Student with roll number "+rntbs+" not found.");
		}
		else {
			System.out.println("Student found "+r.name);
		}
	}

}
