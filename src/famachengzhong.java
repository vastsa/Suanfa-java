import java.util.*;
public class famachengzhong {

	/**
	 * @param args
	 * 试题 算法提高 盾神与砝码称重
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int[] fama = new int[n];
		for (int i = 0; i < fama.length; i++) {
			fama[i]=sc.nextInt();
		}
		int[]wupin = new int[m];
		for (int i = 0; i < wupin.length; i++) {
			wupin[i]=sc.nextInt();
		}
		Arrays.sort(fama);
		for (int i = 0; i < wupin.length; i++) {
			result(fama,wupin[i]);
		}
	}
	static void result(int[] a,int b){
		
	}
}
