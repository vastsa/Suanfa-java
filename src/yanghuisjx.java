import java.util.Scanner;


public class yanghuisjx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int [][] yh =new int [row][row];
		for (int i = 0; i < row; i++) {
			for (int j2 = 0; j2 < row-i; j2++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				
				if (j==0||i==0) {
					yh[i][j]=1;
				}else {
					yh[i][j] = yh[i-1][j-1]+yh[i-1][j];
				}
				System.out.print(yh[i][j]);
			}
			
			System.out.println();
		}
	}

}
