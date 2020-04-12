import java.util.*;
public class chengfacishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int m =sc.nextInt();
		int[] n = new int [m];
		int temp;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			int js=0;
			temp = n[i];
			while (temp/2!=0){
				if (temp%2==0) {
					js++;
				}else {
					js+=2;
				}
				temp/=2;
			}
			System.out.println(js);
		}
	}

}
