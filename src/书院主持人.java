import java.util.*;
public class 书院主持人 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(zcr(m,n));

	}
	public static int zcr(int n,int m){
		if (m==1) {
			return m;
		}
		return (zcr((m-1),n)+n-1)%m+1;
	}
}
