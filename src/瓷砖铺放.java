import java.util.*;

public class ´É×©ÆÌ·Å {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(cizhuan(n));
	}

	public static int cizhuan(int n) {
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 2;
		}else {
			return cizhuan(n-1)+cizhuan(n-2);
		}
	}
}
