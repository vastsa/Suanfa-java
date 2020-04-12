import java.util.*;
public class fj {
	public static void Main(String[] args){
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
