import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ�(0~100):");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char num;
		if(score>=90) {
			num = 'A';
		} else if(score>=80) {
			num = 'B';			
		} else if(score>=70) {
			num = 'C';			
		} else if(score>=60) {
			num = 'D';			
		} else {
			num = 'F';			
		} 
		System.out.println("������ "+num+"�Դϴ�.");
		scanner.close();
	}

}
