import java.util.Scanner;


public class hxqs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int row = sc.nextInt();
		int[][] ju =new int [row][col];
		for (int i = 0; i < ju.length; i++) {
			for (int j = 0; j <=i; j++) {
				ju[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < ju.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ju[i][j]);
			}
		}
	}

}
