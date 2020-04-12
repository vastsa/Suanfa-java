import java.util.*;

public class 计算整数因子 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				boolean flag = true;
				for (int j = 2; j < i; j++) {
					if (i%j==0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					result.add(i);
				}
			}
		}
		Collections.sort(result);
		for (Integer integer : result) {
			System.out.print(integer+" ");
		}
	}

}
