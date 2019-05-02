class Person{
	protected String name;
	protected int year;
	public Person(String name,int year){
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("���[�̸� : "+name+", ���� : "+year+"]");
	}
}

class Student extends Person{

	protected int num;
	
	public Student(String name, int year,int num ) {
		super(name, year);
		this.num = num;
	}
	
	public void show() {
		System.out.println("�л�[�̸� : "+name+", ���� : "+year+", �й� : "+num+"]");
	}
	
}
class ForignStudent extends Student{

	protected String country;
	
	public ForignStudent(String name, int year, int num, String country) {
		super(name, year, num);
		this.country = country;
		
	}
	public void show() {
		System.out.println("�ܱ��л�[�̸� : "+name+", ���� : "+year+", �й� : "+num+", ���� : "+country+"]");
	}
}

public class To_2 {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Person("¯��",22);
		person[1] = new Student("�μ�",22,17);
		person[2] = new ForignStudent("jonh",20,19,"Canada");
		
		for(Person i : person) {
			i.show();
		}
		
		
	}

}
