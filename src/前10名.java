import java.util.*;
public class Ç°10Ãû {

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
		for (int i = list.length-1; i > list.length-11; i--) {
			System.out.print(list[i]+" ");
		}
	}

}
