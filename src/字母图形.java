import java.util.*;
public class ×ÖÄ¸Í¼ÐÎ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int j =0;
		char[] list = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for (int i = 0; i < n; i++) {
			int l = j;
			for (int k = 0; k < m; k++) {
				System.out.print(list[Math.abs(l++)]);
			}
			j--;
			System.out.println();
		}
	}

}
