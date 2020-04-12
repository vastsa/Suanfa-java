import java.util.*;
public class 奥运会开幕式 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt()-1;
		boolean[] list = new boolean[n];
		int count = n;
		int gun = 0;
		if (m==0) {
			System.out.println(n);
		}else {
			while(count!=1){
				for (int i = 0; i < list.length; i++) {
					if (!list[i]) {
						if (gun==m) {
							list[i]=true;
							gun =0;
							count--;
						}else {
							gun++;
						}
					}
				}
			}
			for (int i = 0; i < list.length; i++) {
				if (!list[i]) {
					System.out.println(i+1);
				}
			}
		}
		
	}

}
