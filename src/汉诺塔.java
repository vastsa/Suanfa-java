public class ��ŵ�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hannuota(4, 'a','b', 'c');
	}

	static void hannuota(int n, char a, char b, char c) {
		if (n==1) {
			System.out.println("��"+n+"�Ŵ�"+a+"���Ƶ�"+c+"��");
			return;
		}
		hannuota(n-1, a, c, a);
		System.out.println("��"+n+"�Ŵ�"+a+"���Ƶ�"+c+"��");
		hannuota(n-1, a, b, c);
	}
}
