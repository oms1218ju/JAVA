
public class Book {
	String title;
	String author;
	public Book(String title) {
		this.title = title;
		author = "작자 미상";
	}
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);

	}

}
