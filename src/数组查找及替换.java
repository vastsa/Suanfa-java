import java.util.*;

public class 数组查找及替换 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x % m != 0) {
				list.add(x);
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			int x = list.get(i);
			if (x >= 65 && x <= 90) {
				System.out.print((char) x + " ");
			} else {
				System.out.print(x + " ");
			}
		}
	}

}
