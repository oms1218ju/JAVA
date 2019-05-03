import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run= true;
		int price = 0;
		int balance = 0;
		int val = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			balance = scanner.nextInt();
			switch(balance) {
			case 1:
				System.out.println("예금액>");
				price = price + scanner.nextInt();
				System.out.println();
				break;
			case 2:
				System.out.print("출금액>");
				val = scanner.nextInt();
				price = price - val;
				System.out.println();
				break;
			case 3:
				System.out.println("잔고>"+price);
				break;
			case 4:
				run = false;
				break;
			default:
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
