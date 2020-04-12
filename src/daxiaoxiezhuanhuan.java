import java.util.*;
public class daxiaoxiezhuanhuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i);
			if (n>=65&&n<=90) {
				n+=32;
			}else if (n>=97&&n<=122) {
				n-=32;
			}
			result.append((char)n);
		}
		System.out.println(result);
	}

}
