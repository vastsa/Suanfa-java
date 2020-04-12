import java.util.*;
public class »ØÎÄÊý {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int step = 0;
		step(n,m,step);
	}
	static void step(int n,int m,int i){
		if (huiwen(n+m)) {
			System.out.println("STEP="+i);
		}else if (i>30) {
			System.out.println("Impossible!");
		}
		else {
			int sum = n+m;
			int result =0 ;
			while(sum!=0){
				int x = sum%10;
				result = result*10+x;
				sum/=10;
			}
			step(n+m,result,i);
		}
		
	}
	static boolean huiwen(int n){
		String x = ""+n;
		boolean result = true;
		for (int i = 0,j=x.length()-1; i < x.length()/2; i++,j--) {
			if (x.charAt(i)!=x.charAt(j)) {
				result = false;
			}
		}
		return result;
	}
}
