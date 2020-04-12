import java.util.Scanner;


public class yhsjx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();//行数
        int[][] yanghui = new int[row][row];//6行6列数组
        for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				if (j==0||j==i) {
					yanghui[i][j] = 1;
				}else {
					yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
				}
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
	}

}
