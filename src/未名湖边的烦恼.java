import java.util.*;

public class Î´Ãûºþ±ßµÄ·³ÄÕ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int huan = sc.nextInt();
		int jie = sc.nextInt();
		System.out.println(xie(huan,jie));
	}

	public static int xie(int huan,int jie) {
		if (huan<jie) {
			return 0;
		}
		if (huan==0||jie==0) {
			return 1;
		}
		return xie(huan-1,jie)+xie(huan,jie-1);
	}
}
