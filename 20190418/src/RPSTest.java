import java.util.Scanner;

public class RPSTest {

	static Scanner scanner = new Scanner(System.in);
	
	 static String input(String name) {
		System.out.print(name+": ");
		String result = scanner.next();
		return result;
	}
	public static int whosWin(String a,String b) {
		if(a.equals(b)==true) {
			return 0;
		}else if(a.equals("r")) {
			if(b.equals("s")) {
				return 1;
			} else return -1;
		} else if(a.equals("s")) {
			if(b.equals("p")) {
				return 1;
			} else return -1;
		} else {
			if(b.equals("r")) {
				return 1;
			} else return -1;
		}
			}
	
	public static void main(String[] args) {
		String c = input("ö��");
		String y = input("����");
		int result = whosWin(c, y);
		switch(result){
		case 0: 
			System.out.println("���º�");
			break;
		case 1:
			System.out.println("ö��, ��!");
			break;
		case -1:
			System.out.println("����, ��!");
			break;
		default:
			break;
		}

	}

}
