import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		String engword = " ";
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				engword = eng[i];
			}
		}
		return engword;
				}
}
public class DicApp extends Dictionary {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String enterword = " ";	
		String engword = " ";
		
		while(true) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷� �Դϴ�.");
		System.out.print("�ѱ۴ܾ�?");
		enterword = scan.next();
		engword = kor2Eng(enterword);
		if(engword != " ") {
			if(engword.equals("�׸�")) {break;}
			System.out.println(enterword+"��/�� "+engword);
		} else {
			System.out.println(enterword+"��/�� ���� ������ �����ϴ�.");
			}
		
		}
	}
	
}
