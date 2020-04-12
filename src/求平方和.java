import java.util.*;

public class 求平方和 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[2];
		double[] list1 = new double[2];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}

		for (int i = 0; i < list1.length; i++) {
			list1[i] = sc.nextDouble();
		}
		zheng(list);
		fu(list1);
	}

	static void zheng(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i] * list[i];
		}
		System.out.println(sum);
	}

	static void fu(double[] list) {
		double sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i] * list[i];
		}
		System.out.println(sum);
	}
}
