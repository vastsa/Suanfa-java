import java.util.*;

public class 输入输出格式练习 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int a = Integer.valueOf(str.substring(0, 3)).intValue();
		double b = Double.valueOf(str.substring(3, 9)).doubleValue();
		String d = str.substring(11, 12);
		System.out.printf("%-8d|%8.1f|%s", a, b, d);
	}

}
