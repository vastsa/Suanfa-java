import java.util.*;
public class п║╟виол╗╫в {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(taijie(10));
	}
	static int taijie(int n){
		if (n==2) {
			return 2;
		}else if (n==1||n==0) {
			return 1;
		}
		return taijie(n-1)+taijie(n-2)+taijie(n-3);
	}
}
