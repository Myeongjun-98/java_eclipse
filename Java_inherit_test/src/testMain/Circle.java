package testMain;

public class Circle extends Shape{
	
	public Circle () {};
	public Circle(int width) {
		super(width, width);
	}
	
	@Override
	public void draw() {
		System.out.printf("지름이 %d인 원을 그린다.\n", width);
	}
}
