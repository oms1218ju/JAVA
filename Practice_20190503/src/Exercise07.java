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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			balance = scanner.nextInt();
			switch(balance) {
			case 1:
				System.out.println("���ݾ�>");
				price = price + scanner.nextInt();
				System.out.println();
				break;
			case 2:
				System.out.print("��ݾ�>");
				val = scanner.nextInt();
				price = price - val;
				System.out.println();
				break;
			case 3:
				System.out.println("�ܰ�>"+price);
				break;
			case 4:
				run = false;
				break;
			default:
				break;
			}
			
		}
		System.out.println("���α׷� ����");
		scanner.close();

	}

}
