import java.util.Scanner;

class Account{
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano,String owner,int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano;}
	public String getOwner() { return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				break;
			}
			
		}
		System.out.println("���α׷� ����");
		scanner.close();		
	}
	
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���� ����");
		System.out.println("---------");
		
		String ano,owner;
		int balance;
		
		System.out.print("���¹�ȣ: ");
		ano = scanner.next();
		System.out.print("������: ");
		owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		balance = scanner.nextInt();
		accountArray[num] = new Account(ano,owner,balance);		
		
		num++;
		System.out.println("���°� �����Ǿ����ϴ�.");
	}
	
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���� ���");
		System.out.println("---------");
		try {
			for(int i=0;i<num;i++) {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			}
		}catch(NullPointerException e) {
			System.out.println("?");
		}
	}
	
	private static void deposit(){
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ>");
		String collect = scanner.next();
		for(int i=0;i<num;i++) {
			if((accountArray[i].getAno()).equals(collect)) {
				System.out.print("���ݾ�: ");
				accountArray[i].setBalance((accountArray[i].getBalance()+scanner.nextInt()));
				System.out.println("������ �����Ǿ����ϴ�.");
			}
		}
		
	}
	
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.print("���¹�ȣ>");
		String collect = scanner.next();
		for(int i=0;i<num;i++) {
			if((accountArray[i].getAno()).equals(collect)) {
				System.out.print("��ݾ�: ");
				accountArray[i].setBalance((accountArray[i].getBalance()-scanner.nextInt()));
				System.out.println("����� �����Ǿ����ϴ�.");
			}
		}
		
	}

	
}
