import java.util.*;

public class 分解质因数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) {
			fenjie(i);
		}
	}

	public static void fenjie(int n) {
		StringBuilder result = new StringBuilder();
		result.append(n + "=");
		int x = 2;
		while (n > 1) {
			if (n % x == 0) {
				result.append(x + "*");
				n /= x;
			}else {
				x++;
			}
		}
		result.deleteCharAt(result.length()-1);
		System.out.println(result);
	}
}
