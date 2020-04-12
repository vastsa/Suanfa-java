import java.util.*;

public class 质数的后代 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			zhishu(m*m);
		}
	}

	public static void zhishu(int n) {
		boolean sgin= true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sgin = false;
				break;
			}
		}
		if (sgin) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
