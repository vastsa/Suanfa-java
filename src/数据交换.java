import java.util.*;
public class Êý¾Ý½»»» {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = {n,m};
		x = swap(x);
		for (int i : x) {
			System.out.print(i+" ");
		}
		
	}
	public static int[] swap(int[] n){
		int temp = n[0];
		n[0] = n[1];
		n[1] = temp;
		return n;
	}
}
