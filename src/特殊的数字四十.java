public class 特殊的数字四十 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1000; i < 10000; i++) {
			int sum = 0;
			int x = i;
			for (int j = 0; j < 4; j++) {
				sum += x%10;
				x/=10;
			}
			if (sum == 10) {
				System.out.println(i);
			}
		}
	}

}
