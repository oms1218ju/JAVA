import java.util.Scanner;

class CurrencyConverter{
	protected int exchangeRate;
	protected int price;
	public CurrencyConverter(int exchangeRate2, int num2) {
		// TODO Auto-generated constructor stub
	}
	void exchangeSet(int exchangeRate,int price){
		this.exchangeRate = exchangeRate;
		this.price = price;
	}
	double toDallar() {
		return price/exchangeRate;
	}
	float toKWR() {
		return price*exchangeRate;
	}
	
}
public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0,exchangeRate=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ���� �Է��ϼ���.>>");
		exchangeRate = scanner.nextInt();
		scanner.close();
		System.out.println("�鸸���� ���� ���");
		num=1000000;
		CurrencyConverter cu = new CurrencyConverter(exchangeRate, num);
		System.out.println("�鸸���� $"+cu.toDallar()+"�Դϴ�.");
		num=100;
		CurrencyConverter gs = new CurrencyConverter(exchangeRate, num);
		System.out.println("$"+gs.price+"��"+gs.toKWR()+"�� �Դϴ�.");

	}

}
