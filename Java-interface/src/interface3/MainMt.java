package interface3;

public class MainMt {
	public static void main(String[] args) {
		
		Animals[] animal = new Animals[4];
		animal[0]= new Dog();
		animal[1]= new Cat();
		animal[2]= new Chicken();
		animal[3]= new Dog();
		
		for(Animals ani : animal) {
			ani.sound();
		}
	}
}
/*
	동물소리
		고양이 소리, 닭 소리, 개소리, 


*/