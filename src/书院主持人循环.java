import java.util.Scanner;

public class 书院主持人循环 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt()-1;
		boolean[] result = new boolean[n];
		for (int i = 0; i < n; i++) {
			result[i] = true;
		}
		int count = n;
		int num =0;
		if (m==0) {
			System.out.println(n);
		}else {
			while(count!=1){
				for (int i = 0; i < result.length; i++) {
					if (result[i]) {
						if (num==m) {
							result[i]=false;
							num=0;
							count--;
						}else {
							num++;
						}
					}
				}
			}
			for (int i = 0; i < result.length; i++) {
				if (result[i]) {
					System.out.println(i+1);
				}
			}
		}
		
	}

}
