import java.util.Scanner;


public class lingshuzhu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]result =new int [n];
		int j=0,temp=0;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			if (temp!=0) {
				result[j]=temp;
				j++;
		}
		}
		System.out.println(j);
		for (int i = 0; i < result.length; i++) {
			if (result[i]!=0) {
				System.out.print(result[i]+" ");
			}else {
				
			}
		}
		
	}
}
		
	


