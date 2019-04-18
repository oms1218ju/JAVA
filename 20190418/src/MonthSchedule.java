
import java.util.Scanner;

class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule{

	int date;
	int num;
	int what_to_do;
	
	Day [] day = new Day[31];
	boolean flag = true;
	Scanner scanner = new Scanner(System.in);
	
	public MonthSchedule(int num) {
		this.num = num;
	}
	
	
	
	public void input() {
		
		try {
		System.out.println("��¥(1~30)? ");
		date = scanner.nextInt();	
		System.out.println("����(��ĭ���� �Է�)? ");
		String todo = scanner.next();
		day[date].set(todo);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
		return;
	}
	public void view() {
		System.out.println("��¥(1~30)? ");
		date = scanner.nextInt();
		System.out.print(date+"���� �� ���� ");
		day[date].show();
		System.out.println();
	}
	public void finish() {
		flag = false;
		System.out.println("���α׷��� �����մϴ�.");
	}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		
		for(int i=0;i<day.length;i++) {
			day[i] = new Day();
		}
		while(flag) {
			System.out.println("����(�Է�:1, ����:2, ������:3) >>");
			what_to_do = scanner.nextInt();
			
			switch(what_to_do) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:	
				break;
				}
			
		}
		return;
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
