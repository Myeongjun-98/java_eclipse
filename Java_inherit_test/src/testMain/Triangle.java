package testMain;

public class Triangle extends Shape {
	
	public Triangle() {};
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		System.out.printf("밑변이 %d이고 높이가 %d인 삼각형을 그린다.\n", width, height);
	}
}
