import java.util.*;
public class 数据加密 {

	/**
	 * @param args
	 * 试题 算法提高 数据加密
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		jiami(n);
	}
	static void jiami(int n){
		String x = ""+n;
		int[] sz = new int [x.length()];
		for (int i = 0; i < x.length(); i++) {
			sz[i] =(x.charAt(i)-'0'+5)%10;
		}
		int temp = sz[0];sz[0]=sz[3];sz[3]=temp;
		temp = sz[1];sz[1] =sz[2];sz[1]=temp;
		for (int i = 0; i < sz.length; i++) {
			System.out.print(sz[i]);
		}
	}
}
