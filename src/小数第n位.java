import java.util.*;

public class 小数第n位 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		int n = sc.nextInt();
		int[] nums = new int[100000000];
		int i =0;
		float m =1;
		while(i<nums.length){
			nums[i] = (int)(a/b);
			m=a%b;
			a=m*10;
			i++;
		}
		for (int j = n; j < n+3; j++) {
			System.out.print(nums[j]);
		}
	}

}
