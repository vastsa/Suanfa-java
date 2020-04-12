import java.util.*;
public class shulie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] list = new int[11];
		ArrayList<Integer> result = new ArrayList<Integer>();
		list[0]=1;
		list[1]=k;
		int y = 2;
		int sum=0;
		int temp = k; //用temp暂代K，防止被污染
		//先算出k的方幂
		for (int i = 1; i < 10; i++) {
			temp*=k;
			list[y]=temp;
			y++;
		}
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < i; j++) {
				sum+=list[j];
				result.add(sum);
			}
		}
		System.out.println(result.indexOf(100));
	}

}
