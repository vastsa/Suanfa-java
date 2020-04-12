import java.util.*;

public class kuaisumi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long p = sc.nextInt();
		long ans = 1;
		n %=p;
		while (m > 0) {
			if (m % 2 == 1) {
				ans = (ans * n) % p;
			}
			n = (n * n) % p;
			m >>= 1;
		}
		System.out.println(ans);
	}

}