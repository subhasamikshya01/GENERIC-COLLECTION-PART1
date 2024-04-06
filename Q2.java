package Q2;

class Book{
	public Book(String bid, String bn, Double p) {
		super();
		this.bid = bid;
		this.bn = bn;
		this.p = p;
	}
	private String bid,bn;
	private Double p;
	public String toString() {
		return "Book ID:- "+bid+" Book name:- "+bn+" Price:- "+p;
	}
	public boolean equals(Object o) {
		Book oth=(Book)o;
		if(this.p.equals(oth.p)) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Q2 {

	public static void main(String[] args) {
		Book b1=new Book("b1","n1",200.0);
		Book b2=new Book("b2","n2",202.0);
		Book b3=new Book("b3","n3",202.0);
		System.out.println(b1);
		System.out.println(b2.equals(b3));
	}

}
