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
		System.out.print("환율을 입력하세요.>>");
		exchangeRate = scanner.nextInt();
		scanner.close();
		
		
		System.out.println("백만원에 대해 계산");
		
		CurrencyConverter cu = new CurrencyConverter(exchangeRate);
		
		System.out.println("백만원은 $"+cu.toDallar(1000000)+"입니다.");
		
		CurrencyConverter gs = new CurrencyConverter(exchangeRate);
		System.out.println("$100는"+gs.toKWR(100)+"원 입니다.");

	}

}
