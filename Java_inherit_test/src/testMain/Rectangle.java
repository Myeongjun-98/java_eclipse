package testMain;

public class Rectangle extends Shape{
	
	public Rectangle () {};
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		System.out.printf("밑변이 %d이고 높이가 %d인 사각형을 그린다\n", width, height);
	}
	


	
}
