import java.util.*;

public class 数组排序去重 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int x = sc.nextInt();
			if (!list.contains(x)) {
				list.add(x);
			}
		}
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
