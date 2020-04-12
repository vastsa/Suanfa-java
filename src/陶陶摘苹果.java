import java.util.Scanner;
public class ÌÕÌÕÕªÆ»¹û {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt()+30;
		int result = 0;
		int[] tree = new int [n];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = sc.nextInt();
		}
		for (int i = 0; i < tree.length; i++) {
			if (tree[i]<=m) {
				result++;
			}
		}
		System.out.println(result);
	}

}
