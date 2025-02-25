package study0225;

public class Movie {
	
	private String title;
	private String genre;
	private int year;
	
	// private 제어자 붙은 변수에 데이터 저장
	// 생성자메서드를 사용해서 변수 초기화
	public Movie() {};
	public Movie(String title, String genre, int year) {
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
