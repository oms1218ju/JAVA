import java.util.Scanner;

public class TO_DO_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 5개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int sum  =0;
		int num = 0;
		for(int i=0;i<5;i++) {
			num = scanner.nextInt();
			if(num<0) {
			continue;
			}
			sum = sum+num;
			
		}
			scanner.close();
			System.out.println("양수의 합은 "+sum);
		

	}

}
