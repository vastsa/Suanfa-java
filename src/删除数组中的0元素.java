import java.util.*;
public class 删除数组中的0元素 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(CompactIntegers(list, n));;
		
	}
	static int CompactIntegers(int[]list,int n){
		int sum=0;
		for (int i = 0; i < list.length; i++) {
			if (list[i]!=0) {
				System.out.print(list[i]+" ");
				sum++;
			}
		}
		System.out.println();
		return sum;
	}
}
