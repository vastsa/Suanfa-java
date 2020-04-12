import java.util.*;
public class ºï×Ó·ÖÆ»¹û {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result  = (int)Math.pow(n, n+1) - n*m +m;
		System.out.println(result);
	}

}
