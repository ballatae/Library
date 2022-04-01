package deafult;

public class DummyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Title t1 = new Title(123, "Some title 1");
		System.out.println(t1);
		t1.setTitle("Some title 2");
		System.out.println(t1);
		System.out.println(t1.getId());
		
		Journal j1 = new Journal(456 , "titleeeeee", "filon filoni");
		System.out.println(j1);
		
		Book b1 = new Book(23112, "titulli", "kiki");
		System.out.println(b1);
		
	
	}

}
