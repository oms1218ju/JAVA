import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	 }
	int getArea() {
		return this.width * this.height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Rectangle example = new Rectangle(a,b);
		System.out.println("�簢���� ���̴� "+example.getArea()+"�Դϴ�.");
		scanner.close();

	}

}
