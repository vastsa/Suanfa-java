import java.util.*;

public class �����С������ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long max;
		if (n == 3) {
			max = 1 * 2 * 3;
		} else if (n % 2 == 1) {
			max = n * (n - 1) * (n - 2);
		} else {
			if (n % 3 == 0) {
				max = (n - 1) * (n - 2) * (n - 3);
			} else {
				max = n * (n - 1) * (n - 3);
			}
		}
		System.out.println(max);
	}
}
