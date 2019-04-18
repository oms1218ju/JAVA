import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
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
		System.out.println("한영 단어 검색 프로그램 입니다.");
		System.out.print("한글단어?");
		enterword = scan.next();
		engword = kor2Eng(enterword);
		if(engword != " ") {
			if(engword.equals("그만")) {break;}
			System.out.println(enterword+"은/는 "+engword);
		} else {
			System.out.println(enterword+"은/는 저희 사전에 없습니다.");
			}
		
		}
	}
	
}
