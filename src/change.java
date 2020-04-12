import java.util.*;

public class change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		int result = 0;
		boolean xiangdeng = true; // ÏàµÈ
		
		do {
			boolean jishu = false; // ÆæÊý
			for (int i = 0; i < list.length; i++) {
				if (list[i] != 0) {
					xiangdeng = false;
				}
				if (list[i] % 2 != 0) {
					jishu = true;
				}
			}
			if (jishu) {
				for (int i = 0; i < list.length; i++) {
					if (list[i] % 2 != 0) {
						list[i]--;
						result++;
					}
				}
			} else {
				for (int i = 0; i < list.length; i++) {
					list[i] /= 2;
				}
				result++;
			}
			boolean flag = true;
			for (int i = 0; i < list.length; i++) {
				if (list[i] != 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				break;
			}
		} while (!xiangdeng);
		System.out.println(result);
	}

}
