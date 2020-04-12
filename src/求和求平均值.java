import java.util.*;

public class 求和求平均值 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] list = new double[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextDouble();
		}
		add(list);
		pjz(list);
	}

	static void add(double[] a) {
		double sum = 0;
		for (double f : a) {
			sum += f;
		}
		System.out.printf("%.0f",sum);
		System.out.println();
	}

	static void pjz(double[] a) {
		double sum = 0;
		for (double f : a) {
			sum += f;
		}
		System.out.println(sum / 10);
	}
}
