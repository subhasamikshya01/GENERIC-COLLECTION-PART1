package Q5;

import java.util.Scanner;

class Student implements Comparable<Student>{
	
	String n;
	int rn;
	double tm;
	@Override
	public int compareTo(Student o) {
		return this.rn-o.getrn();
	}
	public int getrn() {
		return this.rn;
	}
	public Student(String n, int rn, double tm) {
		super();
		this.n = n;
		this.rn = rn;
		this.tm = tm;
	}
	public String toString(){
		return "NAME:- "+n+" ROLL NO.:- "+rn+" TOTAL MARK:- "+tm;
	}
}
public class Q5 {

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
		System.out.println("BEFORE SORTING");
		printarray(a);
		System.out.println();
		bubblesort(a);
		System.out.println();
		System.out.println("AFTER SORTING");
		printarray(a);
	}
	public static void bubblesort(Student[]a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					Student t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	public static void printarray(Student[] a) {
		for(Student i:a) {
			System.out.println(i);
		}
	}
}


