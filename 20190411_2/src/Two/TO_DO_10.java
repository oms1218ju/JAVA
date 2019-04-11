package Two;

import java.util.Scanner;

 abstract class Cal{
	protected int a,b;
	public void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
}

class Add extends Cal{
	
	int calculate() {
		return a+b;
	}
}

class Sub extends Cal{
	
	int calculate() {
		return a-b;		
	}
}

class Mul extends Cal {
	
	int calculate() {
		return a*b;
	}
}

class Div extends Cal {
	
	int calculate() {
		try {
		return a/b;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
			
		} 
	}
}

public class TO_DO_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result = 0;
		String c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오.>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.next();
		scanner.close();
		switch(c) {
		
		case "+": 
			Add add = new Add();
			add.setValue(a,b);
			result = add.calculate();
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a,b);
			result = sub.calculate();
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
			break;
		default:
			System.out.println("연산자를 제대로 입력해주세요.");
			break;
		}
		
		System.out.println("연산 결과는 "+result+"입니다.");
		 
		}

	}
