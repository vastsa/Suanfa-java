import java.util.*;

public class 递归求二进制表示位数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(turn(n, result).reverse().length());;
	}

	static StringBuilder turn(int n, StringBuilder x) {
		if (n / 2 == 0) {
			x.append(n % 2);
			return x;
		}
		x.append(n % 2);
		n /= 2;
		return turn(n, x);
	}
}
