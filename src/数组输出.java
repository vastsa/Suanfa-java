import java.util.*;
public class Êý×éÊä³ö {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] list = new int[3][4];
		int max = 0,maxi=0,maxj=0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				int a = sc.nextInt();
				if (a<0) {
					a = -a;
				}
				if (a>max) {
					max = a;
					maxi =i+1;
					maxj = j+1;
				}
			}
		}
		if (maxi==0&&maxj==0) {
			maxi=1;
			maxj=1;
		}
		System.out.println(max+" "+maxi+" "+maxj);
	}

}
