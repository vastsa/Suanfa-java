import java.util.Scanner;


public class ones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for (int i = 1; i <=n; i++) {
			String x = ""+i;
			for (int j = 0; j < x.length(); j++) {
				char y = x.charAt(j);
				if (y=='1') {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
