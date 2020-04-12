import java.util.*;
public class 出现次数最多的整数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] list = new int[500];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list[x]+=1;
		}
		int index=0;
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-i-1; j++) {
				if (list[j]>list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					index = i;
				}
			}
		}
		System.out.println(index);
	}

}
