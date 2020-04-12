import java.util.Scanner;


public class fjde {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = fj(n);
		System.out.println(result);
			
		}
	static String fj(int n){
		if(n==1){
			return "A";
		}
		return fj(n-1)+(char)('A'+n-1)+fj(n-1);
	}

}
