import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	private String stack[];
	private int point = 0;
	private int i=0;

	StringStack(int num){
		stack= new String[num];
		for(int i=0;i<num;i++) {
			stack[i] = null;
		}
		
		
	}
	
	@Override
	public int length() {
		
		for(int i=0;i<stack.length;i++) {
			if(stack[i] != null) {
				point++;
			}
		}
		return point;
		
	}

	@Override
	public int capacity() {		
		
		return stack.length - point;
	}

	@Override
	public String pop() {
		String sent = " ";
		for(int p = stack.length - 1;p>=0;p--) {
		sent += stack[p]+"\t";
			
		}
		
		return sent;
	}

	@Override
	public boolean push(String val) {
		try {
		stack[i] = val;
		i++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("스택이 꽉차서 푸시 불가!");
		}
		return true;
	}
}

public class StackApp {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int length = scanner.nextInt();
		StringStack stack = new StringStack(length);
		
		while(flag) {
			System.out.print("문자열 입력 >> ");
			String sentence = scanner.next();
			if(sentence.equals("exit")) {			
				break;
			}
			
			flag = stack.push(sentence);
		}
		System.out.print("스택에 저장된 모든 문자열 팝: ");
		String sen= stack.pop(); 
		System.out.print(sen);
		

		scanner.close();
	}

}
