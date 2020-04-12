import java.util.*;
public class 第三十九级台阶 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		System.out.println(result(n,sum));;
	}
	static int result(int x,int sum){
		
		if (x>0) {
			sum+=x;
			x--;
			return result(x,sum);
		}else{
			return sum;
		}
	}
}
