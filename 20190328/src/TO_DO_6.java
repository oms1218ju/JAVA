import java.util.Scanner;

public class TO_DO_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price;
		System.out.print("���� Ŀ�� �帱���?");
		String coffee = scanner.next();
		switch(coffee) {
		case "����������": price = 3500; break;
		case "īǪġ��": price = 3500; break;
		case "ī���": price = 3500; break;
		case "�Ƹ޸�ī��": price = 2000; break;
		default: price=0; break;
		
		}
		System.out.println(coffee+"�� "+price+"�� �Դϴ�.");
		scanner.close();

	}

}
