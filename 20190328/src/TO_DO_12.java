import java.util.Scanner;

public class TO_DO_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print(">>");
			String correct = scanner.next();
			
			if("exit".contentEquals(correct)) break;
			
		}
		
		scanner.close();
		System.out.println("�����մϴ�...");

	}

}
