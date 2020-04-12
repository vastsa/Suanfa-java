import java.util.*;

public class ÏàÁÚÊı¶Ô {

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
		Arrays.sort(list);
		int sum = 0;
		for (int i = 0; i < list.length-1; i++) {
			if (list[i]+1==list[i+1]) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
