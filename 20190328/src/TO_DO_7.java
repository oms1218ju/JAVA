
public class TO_DO_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<11;i++) {
			if(i==10) {
				System.out.print(i+"=");
				sum = sum+i;
			} else {
				System.out.print(i+"+");
				sum = sum+i;
			}
		  }
		  System.out.print(sum);
		}

}
