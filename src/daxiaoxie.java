import java.util.*;
public class daxiaoxie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int x = n.charAt(0);
		if (x>=65&&x<=90) {
			System.out.println("upper");
		}else if (x>=97&&x<=122) {
			System.out.println("lower");
		}
	}

}
