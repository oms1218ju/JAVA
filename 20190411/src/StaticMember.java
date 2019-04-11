import java.util.Scanner;

class CurrencyConverter{
	protected static int exchangeRate;
	
	public CurrencyConverter(int num) {
		exchangeRate = num;
	}
	
	double toDallar(int num) {
		return (double)num/exchangeRate;
	}
	float toKWR(int num) {
		return num*exchangeRate;
	}
	
}
public class StaticMember {

	public static void main(String[] args) {

		int exchangeRate;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ���� �Է��ϼ���.>>");
		exchangeRate = scanner.nextInt();
		scanner.close();
		
		
		System.out.println("�鸸���� ���� ���");
		
		CurrencyConverter cu = new CurrencyConverter(exchangeRate);
		
		System.out.println("�鸸���� $"+cu.toDallar(1000000)+"�Դϴ�.");
		
		CurrencyConverter gs = new CurrencyConverter(exchangeRate);
		System.out.println("$100��"+gs.toKWR(100)+"�� �Դϴ�.");

	}

}
