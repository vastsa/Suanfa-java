import java.util.*;
public class zhaolingqian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result=0; //≥ı º«Æ
		int temp=0;//÷–ΩÈ÷µ
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt()/25;
			if (temp==1) {
				result+=1;
			}else if (temp==2) {
				result+=1;
			}else {
				result-=3;
			}
		}
		if (result>=0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
