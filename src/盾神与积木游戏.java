import java.util.*;

public class 盾神与积木游戏 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int sum = 0;
			int[][] list = new int[m][2];
			for (int j = 0; j < list.length; j++) {
				for (int j2 = 0; j2 < list[0].length; j2++) {
					list[i][j2] = sc.nextInt();
				}
			}
			for (int[] js : list) {
				for (int j : js) {
					System.out.println(j);
				}
			}
//			for (int j = 0; j < list.length; j++) {
//				if (list[j][1] >= list[j][0]) {
//					sum += list[j][1];
//				} else {
//					sum += list[j][1] - list[j][0];
//				}
//			}
//			if (sum >= 0) {
//				result.add("YES");
//			} else {
//				result.add("NO");
//			}
		}
		for (String string : result) {
			System.out.println(string);
		}
	}

}
