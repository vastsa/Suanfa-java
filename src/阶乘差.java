import java.util.*;

public class ½×³Ë²î {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		System.out.println((jiecheng(n, p) - jiecheng(m, p) + p) % p);
	}

	public static int jiecheng(int n, int p) {
		if (n == 1) {
			return 1;
		} else {
			return n * jiecheng(n - 1, p) % p;
		}

	}
}
