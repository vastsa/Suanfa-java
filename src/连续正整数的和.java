import java.util.*;
public class 连续正整数的和 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			int t =0;
			for (int j = i; j < n; j++) {
				if (t>n) {
					break;
				}else if (t==n) {
					System.out.println(i + " " + (j - 1));
				}
				t = t+j;
			}
		}
	}

}
