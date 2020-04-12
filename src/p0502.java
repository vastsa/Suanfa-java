import java.util.*;
public class p0502 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		int max = list[n-1];
		int[]result =new int [max+1];
		for (int i = 0; i < list.length; i++) {
			int temp = list[i];
			result[temp]+=1;
		}
		int maxsz=0,index=0;
		for (int i = 0; i < result.length; i++) {
			if (result[i]>maxsz) {
				maxsz=result[i];
				index=i;
			}
		}
		System.out.println(index);
	}

}
