import java.util.Scanner;

public class TO_DO_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�(0~100):");
		int score = scanner.nextInt();		
		System.out.print("�г��� �Է��ϼ���(1~4):");
		int grade = scanner.nextInt();
		
		if(grade==4) {
			if(score>=70) {
				System.out.println("�հ�!");
			} else {
				System.out.println("���հ�!");
			}
		} else {
			if(score>=60) {
				System.out.println("�հ�!");
			} else {
				System.out.println("���հ�!");
			}
		}
		
		scanner.close();
	}

}