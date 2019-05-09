interface Shape{
	final double Pi = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("---다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{

	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public void draw() {
	
			System.out.println("*");
		
	}

	@Override
	public double getArea() {
		
		return Pi*radius*radius;
	}
	
}
public class TO_DO_4{
	
	

	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
		
	}

}
