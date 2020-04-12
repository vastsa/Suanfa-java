public class 汉诺塔 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hannuota(4, 'a','b', 'c');
	}

	static void hannuota(int n, char a, char b, char c) {
		if (n==1) {
			System.out.println("把"+n+"号从"+a+"柱移到"+c+"柱");
			return;
		}
		hannuota(n-1, a, c, a);
		System.out.println("把"+n+"号从"+a+"柱移到"+c+"柱");
		hannuota(n-1, a, b, c);
	}
}
