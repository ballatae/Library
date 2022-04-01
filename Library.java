package deafult;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Title> titles;
	private List<Member> members;
	private List<Borrowable> borrowables;

	public Library() {
		titles = new ArrayList<Title>();
		members = new ArrayList<Member>();
		borrowables = new ArrayList<Borrowable>();

	}

	public void addTitle(Title t) {
		if (!titles.contains(t)) {
			titles.add(t);
		}
	}

	public void addBoworrable(Borrowable b) {
		if (!borrowables.contains(b)) {
			borrowables.add(b);
		}
	}

	public void addMember(int id, String name) {
		members.add(new Member(id, name));
	}
}
