import java.util.*;
public class P0505 {

	/**
	 * @param args
	 * ÊÔÌâ Ëã·¨ÑµÁ· P0505
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		n = jiecheng(n);
		String str = ""+n;
		for (int i = str.length()-1; i >0 ; i--) {
			int x = str.charAt(i)-'0';
			if (x!=0) {
				System.out.println(x);
				break;
			}
		}
	}
	static long jiecheng(long n){
		if (n==1) {
			return n;
		}
		return jiecheng(n-1)*n;
	}
}
