import java.util.*;

public class 身份证号码升级 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.substring(0, 6) + "19" + str.substring(6, 15);
		char[] yzm = { '1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2' };
		int[] xs = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		List<Character> list = new ArrayList<Character>();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			sum += (int) (str.charAt(i) - 48) * xs[i];
			list.add(x);
		}
		sum %= 11;
		list.add(yzm[sum]);
		for (Character character : list) {
			System.out.print(character);
		}
	}
}
