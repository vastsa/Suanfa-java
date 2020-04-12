import java.util.*;
public class 约数个数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
