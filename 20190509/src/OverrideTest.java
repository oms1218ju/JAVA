class Vehicle{
	protected String color;
	protected int speed;
	public Vehicle(String color,int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("Ż ���� ������ "+color+", �ӵ��� "+speed);
	}
}

class Car extends Vehicle{

	private int displacement;
	private int gears;
	
	public Car(String color, int speed,int displacement,int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
		
	}
	@Override
	void show() {
		System.out.println("���� ������ "+color+", �ӵ��� "+speed+", ��ⷮ�� "+displacement+", ���� "+gears);
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("�Ķ�",200,100,5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();

	}

}
