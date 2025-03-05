package generic2;

public class Bottle<T extends Alcohol> {	//	제네릭 타입을 사용하는 클래스
	T item;
	
	public void make(T item) {
//		public <T extends Alcohol> void make(T item)	클래스 자체가 아니라 메서드에도 따로 설정할 수 있음.
		System.out.println("만들기");
		this.item = item;
		System.out.println(item);
	}
	
	public T getItem()	{
		return this.item;
	}
	
	
}
