import java.util.Scanner;


public class qiuzuidazhi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []sz = new int[n];
		int temp=0,index=0,result=0;
		for (int i = 0; i < sz.length; i++) {
			sz[i]=sc.nextInt();
			if (sz[i]>result) {
				result = sz[i];
				index = i;
			}
		}
		System.out.println(result+" "+index);
	}

}
