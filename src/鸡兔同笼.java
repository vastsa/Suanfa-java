import java.util.*;
public class 鸡兔同笼 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] n = new int[a];
		int[] m = new int[a];
		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			result(n[i],m[i]);
		}
	}
	static void result(int n,int m ){
		//兔为i，则鸡为n-i
		boolean isanswer =true;
		for (int i = 0; i < n; i++) {
			if (i*4+(n-i)*2==m) {
				System.out.println(i+" "+(n-i));
				isanswer =false;
			}
		}
		if (isanswer) {
			System.out.println("No answer");
		}
	}

}
