import java.util.*;
public class jiaohuaneasy {

	/**
	 * @param args
	 * 试题 算法提高 交换Easy
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i]=sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int x =sc.nextInt()-1;
			int y =sc.nextInt()-1;
			int temp=0;
			for (int j = 0; j < list.length; j++) {
				if (j==x) {
					temp = list[j];
					list[j]=list[y];
					list[y]=temp;
				}
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
