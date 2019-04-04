import java.util.Scanner;

public class TO_DO_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int num=0;
		int sum=0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		while(num != -1) {
			num = scanner.nextInt();
			if(num != -1) {
			
			sum = sum+num;
			count++;
			}
		}
		scanner.close();
		System.out.println("정수의 개수는 "+count+"개 이며 평균은 "+(float)sum/count+"입니다.");

	}

}
