import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max=0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���>");
				studentNum = scanner.nextInt();
				for(int i=0;i<studentNum+1;i++) {
					scores = new int[i];
							}
			} else if (selectNo == 2) {
				try {
					for(int j=0;j<studentNum;j++) {
						System.out.print("scores["+j+"]>");
						scores[j] = scanner.nextInt();
					}
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("?");
				}
			} else if(selectNo == 3) {
				
				try {
					for(int k=0;k<studentNum;k++) {
						System.out.println("scores["+k+"]:"+scores[k]);				
						}
					}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("?");
				}
				
			} else if(selectNo == 4) {
				System.out.print("�ְ� ����: ");
				
							
				try {
					for(int p=0;p<studentNum-1;p++) {
						if(scores[p]>scores[p+1]) {
							max = scores[p];
						} else {
							max = scores[p+p];
						}
					}
					for(int i=0;i<studentNum;i++) {
						sum = sum + scores[i];
					}
					
					System.out.println(max);
					System.out.println("��� ����:"+sum/studentNum);
						}catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("?");
				}
				

			} else if(selectNo == 5) {
				run = false;
				scanner.close();
			}
			
			
			
		}

		System.out.println("���α׷� ����");
	}

}
