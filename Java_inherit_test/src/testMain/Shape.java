package testMain;

public abstract class Shape {
	protected int width;
	protected int height;
	
	Shape() {};
	protected Shape(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public abstract void draw();
	
	
	
	
}
