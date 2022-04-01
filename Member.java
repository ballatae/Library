package deafult;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String name;
	static final int MAX_ON_LOAN = 6;
	private List<Borrowable> onLoan;

	// final means the attribute is a constant
	// static: we will discuss this on week 6-7
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		onLoan = new ArrayList<Borrowable>(MAX_ON_LOAN);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "Max on loan is=" + MAX_ON_LOAN + "]";
	}

	public void borrows(Borrowable b) {
		//if b is not available 
		//"error" -> throw exception
		
		//if  member exceeds maximum
		//"error" -> throw exception
		
		//if b is already borrowed by the
		//member "error" -> throw exception
		
		//best case scenario
		onLoan.add(b);
		//change the availability of b
		
	}

	public void returns(Borrowable b) {

	}
}
