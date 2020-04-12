import java.util.*;
public class ÓÑºÃÊý {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum1 =0;
		int sum2=0;
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 1; i < n; i++) {
			if (n%i==0) {
				sum1+=i;
			}
			if (sum1==m) {
				flag1 = true;
				break;
			}
		}
		for (int i = 1; i < m; i++) {
			if (m%i==0) {
				sum2+=i;
			}
			if (sum2==n) {
				flag2 = true;
				break;
			}
		}
		if (flag1&&flag2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
