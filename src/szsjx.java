import java.lang.Math;
import java.util.*;
public class szsjx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int row = sc.nextInt();
		int [][] sjx = new int [row][row];
		int [][] sum=new int [row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				sjx[i][j]=sc.nextInt();
			}
		}
		for (int j = 0; j < row; j++)
			sum[row - 1][j] = sjx[row - 1][j];
		for (int i = row-2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				sum[i][j] = Math.max(sum[i + 1][j], sum[i + 1][j + 1])+ sjx[i][j];
			}
		}
		System.out.println(sum[0][0]);
	}

}
