import java.util.*;

public class 二进制数数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int nums = 0;
		for (int i = n; i <= m; i++) {
			String x = Integer.toBinaryString(i) + "";
			for (int j = 0; j < x.length(); j++) {
				char y = x.charAt(j);
				if (y == '1') {
					nums++;
				}
			}
		}
		System.out.println(nums);
	}

}
