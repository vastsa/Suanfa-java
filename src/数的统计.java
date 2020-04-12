import java.util.*;
public class 数的统计 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[1000000];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list[x]++;
		}
		int max = 0;int index = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i]>max) {
				max = list[i];
				index = i;
			}
		}
		if (n>0) {
			System.out.println(index);
		}else {
			System.out.println();
		}
	}

}
