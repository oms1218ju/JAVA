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
		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		int result = whosWin(c, y);
		switch(result){
		case 0: 
			System.out.println("¹«½ÂºÎ");
			break;
		case 1:
			System.out.println("Ã¶¼ö, ½Â!");
			break;
		case -1:
			System.out.println("¿µÈñ, ½Â!");
			break;
		default:
			break;
		}

	}

}
