import java.util.*;
public class 整数平均值 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] list = new int[n];
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
			sum+=list[i];
		}
		System.out.println(sum/n);
	}

}
