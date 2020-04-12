import java.util.Scanner;


public class shuixianhaushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 10;
		for (int i = 1; i < n; i++) {
			x*=10;
		}
		for (int i = 0; i < x; i++) {
			System.out.println(i);
			while(i>0){
				
			}
			if (g*g*g+s*s*s+b*b*b==i) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			
			}
		}
		
	}

}
