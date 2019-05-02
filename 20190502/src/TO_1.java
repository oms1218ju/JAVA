class Circle{
	protected int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void show() {
		System.out.println("�������� "+radius+"�� ���̴�.");
	}
	
}

class ColoredCircle extends Circle{
	private String color;
	public ColoredCircle(int radius,String color) {
		super(radius);
		this.color = color;
	} 
	public void show() {
		System.out.println("�������� "+radius+"�� "+color+" ���̴�.");
	}
	
}

public class TO_1 {
	
	public static void main(String[] args) {
		
		Circle num = new Circle(5);
		num.show();
		ColoredCircle yello = new ColoredCircle(10,"Red");
		yello.show();
	}
}
