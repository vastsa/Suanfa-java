import java.util.Arrays;


public class gougushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[3];
		for (int i = 1; i < 1000; i++) {
			for (int j = i; j < 1000; j++) {
				for (int k = j; k < 1000; k++) {
					if (i+j+k<=1000 && i*i+j*j==k*k) {
						System.out.println(i+" "+j+" "+" "+k);
					}
				}
			}
		}
	}

}
