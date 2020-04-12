import java.util.*;

public class 动态数组使用 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int sum =0;
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i);
		}
		System.out.println(sum+" " + sum/list.size());
	}

}
