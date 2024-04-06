package Q1_MODIFIED;

class STUDENT<T extends Number> implements Comparable<STUDENT<T>>
{
	public STUDENT(String name, T rollno, int age) {
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	String name;
	T rollno;
	int age;
	@Override
	public boolean equals(Object o){
		STUDENT<T> ob=(STUDENT<T>)o;
		if(this.rollno.equals(ob.rollno)){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public int compareTo(STUDENT<T> s){
		if(this.equals(s)){
			return 0;
		}
		
		else{
			return 1;
		}
	}
		
}
public class Q1_MODIFIED {

	public static void main(String[] args)
	{
		STUDENT<Double> s1=new STUDENT<Double>("N1",2.0,19);
		STUDENT<Integer> s2=new STUDENT<Integer>("N2",1,19);
		STUDENT<Double> s3=new STUDENT<Double>("N3",2.0,19);
		System.out.print("STUDENT 1'S ROLL NUMBER EQUALS TO STUDENT 2'S:- ");
		System.out.println(s1.equals(s3));
		System.out.print("STUDENT 1'S ROLL NUMBER EQUALS TO STUDENT 2'S:- ");
		System.out.println(s1.compareTo(s3));

		
	}

}