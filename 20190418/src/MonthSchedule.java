
import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.println("날짜(1~30)? ");
		date = scanner.nextInt();	
		System.out.println("할일(빈칸없이 입력)? ");
		String todo = scanner.next();
		day[date].set(todo);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("다시 입력하세요.");
		}
		
		return;
	}
	public void view() {
		System.out.println("날짜(1~30)? ");
		date = scanner.nextInt();
		System.out.print(date+"일의 할 일은 ");
		day[date].show();
		System.out.println();
	}
	public void finish() {
		flag = false;
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		for(int i=0;i<day.length;i++) {
			day[i] = new Day();
		}
		while(flag) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
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
