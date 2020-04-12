import java.util.*;

public class lucknum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] list = new int[n - m];
		for (int i = 0, x = m+1; i < list.length; i++, x++) {
			list[i] = x;
		}
		for (int i : list) {
			System.out.println(i);
		}
	}

}
