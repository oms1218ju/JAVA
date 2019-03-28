import java.util.Scanner;

public class TO_DO_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오(0~100):");
		int score = scanner.nextInt();
		char num;
		switch(score/10) {
		
		case 9: num='A';
		        break;
		case 8: num='B';
		        break;
		case 7: num='C';
		        break;
		case 6:	num='D';
		        break;
		default: num='F';
		        break;
		
		}
		System.out.println("학점은 "+num+"입니다.");
		scanner.close();

	}

}
