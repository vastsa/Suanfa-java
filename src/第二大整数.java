import java.util.*;
public class 第二大整数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int x = 0;
		do {
			x = sc.nextInt();
			if (x!=0) {
				list.add(x);
			}
		} while (x!=0);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
	}

}
