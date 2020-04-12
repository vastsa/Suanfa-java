import java.util.*;

public class ¡‚–Œ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n+1; i++){
			   for(int j = n - i+1; j > 0; j--){
			    System.out.print(" ");
			   }
			   for(int k = 1; k < 2*i; k++){
			    System.out.print("*");
			   }
			   System.out.println();
			  }
			  //œ¬≤„
			   int t = 0;
			  for(int i = 1; i <= 2*n; i+=2){
			   for(int j = 0; j < t+1; j++){
			    System.out.print(" ");
			   }
			   t++;
			   for(int k = 0; k < 2*n-i; k++){
			    System.out.print("*");
			   }
			   System.out.println();
			  }
	}

}
