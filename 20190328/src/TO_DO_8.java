import java.util.Scanner;

public class TO_DO_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int num=0;
		int sum=0;
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		while(num != -1) {
			num = scanner.nextInt();
			if(num != -1) {
			
			sum = sum+num;
			count++;
			}
		}
		scanner.close();
		System.out.println("������ ������ "+count+"�� �̸� ����� "+(float)sum/count+"�Դϴ�.");

	}

}
