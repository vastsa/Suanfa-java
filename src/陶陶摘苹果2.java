import java.util.*;

public class ÌÕÌÕÕªÆ»¹û2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt()+30;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x > m ) {
				result++;
			}
		}
		System.out.println(result);
	}

}
