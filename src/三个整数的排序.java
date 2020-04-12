import java.util.*;
public class 三个整数的排序 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		for (int i = 0; i < list.length; i++) {
			list[i]= sc.nextInt();
		}
		Arrays.sort(list);
		for (int i = list.length-1; i >=0; i--) {
			System.out.print(list[i]+" ");
		}
	}

}
