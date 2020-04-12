import java.util.*;

public class ¿ìÀÖË¾»ú {

	/**
	 * @param args
	 */
	public static class good {
		public int gi;
		public int pi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		good[] goods = new good[n];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new good();
			goods[i].gi = sc.nextInt();
			goods[i].pi = sc.nextInt();
		}
		for (int i = 0; i < goods.length-1; i++) {
			for (int j = 0; j < goods.length-i-1; j++) {
				if (goods[j].pi<goods[j+1].pi) {
					good temp = goods[j];
					goods[j] = goods[j+1];
					goods[j+1] = temp;
				}else if (goods[j].pi==goods[j+1].pi) {
					if (goods[j].gi>goods[j+1].gi) {
						good temp = goods[j];
						goods[j] = goods[j+1];
						goods[j+1] = temp;
					}
				}
			}
		}
		int i = 0,result=0;
		while (w>=0){
		}
	}

}
