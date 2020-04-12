import java.util.*;
public class P0103 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char n = sc.next().charAt(0);
		if (n>=65&&n<=90) {
			n+=32;
		}else if (n>=97&&n<=122) {
			n-=32;
		}
		System.out.println((char)n);
	}

}
