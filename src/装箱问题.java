import java.util.*;
public class ×°ÏäÎÊÌâ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]list= new int[m];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		for (int i = list.length-1; i >=0; i--) {
			if (n>=list[i]) {
				n-=list[i];
			}
		}
		System.out.println(n);
	}

}
