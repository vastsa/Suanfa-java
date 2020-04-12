import java.util.*;
public class dashuiwenti {

	/**
	 * @param args
	 * 试题 算法提高 打水问题
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]list = new int [n];
		for (int i = 0; i < list.length; i++) {
			list[i]=sc.nextInt();
		}
		Arrays.sort(list);
		int sum=0;
		for (int i = 0; i < m; i++) {
			int temp=list[i];
			for (int j = i+m; j < list.length; j+=m) {
				sum+=temp;
				temp+=list[j];
			}
		}
		System.out.println(sum);
	}

}
