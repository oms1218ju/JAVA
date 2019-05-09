class Vehicle{
	protected String color;
	protected int speed;
	public Vehicle(String color,int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("탈 것의 색상은 "+color+", 속도는 "+speed);
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
		System.out.println("차의 색상은 "+color+", 속도는 "+speed+", 배기량은 "+displacement+", 기어는 "+gears);
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("파랑",200,100,5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();

	}

}
