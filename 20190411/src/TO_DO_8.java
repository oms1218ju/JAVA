class TV{
	private String name;
	private int year;
	private int inch;
	public TV(String name,int year,int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
		
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"���� ���� "+this.year+"���� "+this.inch+"��ġ TV");
		
	}
	
}

public class TO_DO_8 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG",2017,32);
		myTV.show();

	}

}
