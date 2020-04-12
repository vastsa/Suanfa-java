import java.util.*;
public class sushupanduan {

	/**
	 * @param args
	 * ÅĞ¶ÏËØÊı
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		IsPrime(n);
	}

	private static void IsPrime(int n) {
		// TODO Auto-generated method stub
		boolean result = true;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				result = false;
				break;
			}
		}
		if (result==true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
