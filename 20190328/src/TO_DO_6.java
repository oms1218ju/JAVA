import java.util.Scanner;

public class TO_DO_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price;
		System.out.print("무슨 커피 드릴까요?");
		String coffee = scanner.next();
		switch(coffee) {
		case "에스프레소": price = 3500; break;
		case "카푸치노": price = 3500; break;
		case "카페라떼": price = 3500; break;
		case "아메리카노": price = 2000; break;
		default: price=0; break;
		
		}
		System.out.println(coffee+"는 "+price+"원 입니다.");
		scanner.close();

	}

}
