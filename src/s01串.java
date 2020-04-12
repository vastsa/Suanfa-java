import java.util.*;

public class s01´® {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String x = "0";
		for (int i = 0; i < n; i++) {
			x = s(x);
		}
		System.out.println(x);
	}

	static String s(String x) {
		StringBuilder y = new StringBuilder();
		for (int j = 0; j < x.length(); j++) {
			char z = x.charAt(j);
			if (z == '0') {
				y.append("1");
			} else if (z == '1') {
				y.append("01");
			}
		}
		x = y.toString();
		return x;
	}
}
