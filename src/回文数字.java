import java.util.*;

public class »ØÎÄÊı×Ö {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		for (int i = 10000; i < 1000000; i++) {
			if (huiwen(i)) {
				String x = ""+i;
				int sum = 0;
				char[] z = x.toCharArray();
				for (int j = 0; j < z.length; j++) {
					sum+=z[j]-'0';
				}
				if (sum==n) {
					System.out.println(i);
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println(-1);
		}
	}

	static boolean huiwen(int n) {
		String x = "" + n;
		boolean result = true;
		for (int i = 0, j = x.length() - 1; i < x.length() / 2; i++, j--) {
			if (x.charAt(i) != x.charAt(j)) {
				result = false;
			}
		}
		return result;
	}
}
