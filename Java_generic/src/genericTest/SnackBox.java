package genericTest;

public class SnackBox<T extends Snack>{
	T content;
	
	public void makeBox(T content) {
		System.out.println("담기");
		this.content = content;
		System.out.println(this.content);
	}

	public void makeBox(T content, T content2) {
		System.out.println("담기");
		this.content = content;
		this.content = content2;
		System.out.print(content);
		System.out.println(" \n" + content2);
	}
	
	
}
