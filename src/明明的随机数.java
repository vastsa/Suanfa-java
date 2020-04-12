import java.util.*;
public class 明明的随机数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> reuslt = new ArrayList<Integer>();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			int x = sc.nextInt();
			boolean flag = true;
			for (int j = 0; j < list.length; j++) {
				if (x==list[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list[i] = x;
			}
		}
		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			if (list[i]!=0) {
				reuslt.add(list[i]);
			}
		}
		System.out.println(reuslt.size());
		for (int i : reuslt) {
			System.out.print(i+" ");
		}
	}

}
