import java.util.*;

public class ������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0 && i != 2)
				continue; // ż����1�ų�
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
