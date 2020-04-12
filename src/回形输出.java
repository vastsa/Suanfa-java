import java.util.*;

public class 回形输出 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int row = 0; //开始行
		int col = 0; //开始列
		int endrow = arr.length-1; //结束行
		int endcol = arr[0].length-1;  //结束列
		int startrow = row; //用来计数的行
		int startcol = col; //用来技术的列
		while((row<endrow)&&(col<endcol)){
			while (startrow <= endrow) {
				System.out.print(arr[startrow][startcol]+" ");
				startrow++;
			}
			startrow--;startcol++;
			while (startcol <= endcol) {
				System.out.print(arr[startrow][startcol]+" ");
				startcol++;
			}
			startcol--;startrow--;
			while(startrow>=row){
				System.out.print(arr[startrow][startcol]+" ");
				startrow--;
			}
			startrow++;startcol--;
			while(startrow> col){
				System.out.print(arr[startrow][startcol]+" ");
				startrow--;
			}
			row++;
			col++;
			endrow--;
			endcol--;
		}
	}

}
