import java.util.*;

public class ������� {

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
		int row = 0; //��ʼ��
		int col = 0; //��ʼ��
		int endrow = arr.length-1; //������
		int endcol = arr[0].length-1;  //������
		int startrow = row; //������������
		int startcol = col; //������������
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
