import java.util.*;

public class ���������ʽ��ϰ {

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
