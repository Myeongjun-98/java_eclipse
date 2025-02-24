package study0224;

public class JavaFlow1 {

	static void total(Game g1, Game g2, Game g3) {
		int tot = g1.cnt + g2.cnt + g3.cnt;
		System.out.println("총합 : " +  tot);
	}		
		
	public static void main(String[] args) {
		Game game1 = new Game()	;
		Game game2 = new Game("문명", 435);
		Game game3 = new Game("사이버펑크", 3412);
			total(game1, game2, game3);
	}

}
