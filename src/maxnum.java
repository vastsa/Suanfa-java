import java.util.*;
public class maxnum {

	/**
	 * 选最大数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		for (int i = 0; i < list.length; i++) {
			list[i]=sc.nextInt();
		}
		Arrays.sort(list);
		System.out.println(list[2]);
	}

}
