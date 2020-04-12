import java.util.*;

public class ±¿Ð¡ºï {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		int[] zm = new int[26];
		for (int i : str) {
			++zm[i-'a'];
		}
		int max =0;int min = Integer.MAX_VALUE;
		for (int i : zm) {
			if (i!=0) {
				if (i>max) {
					max = i;
				}else if (i<min) {
					min = i;
				}
			}
		}
		if (iszs(max-min)) {
			System.out.println("Lucky Word");
			System.out.println(max-min);
		}else {
			System.out.println("No Answer");
			System.out.println(0);
		}
		
	}
	public static boolean iszs(int n){
		boolean result = true;
		if (n==1||n==0) {
			result = false;
		}else{
			for (int i = 2; i < n; i++) {
				if (i%n==0) {
					result=false;
					break;
				}
			}
		}
		return result;
	}
}
