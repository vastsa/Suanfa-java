
public class szsum {

	/**
	 * @param args
	 * b ������ͽ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		//���÷���
		int b = sum(arr);
		//������
		System.out.println(b);
	}
	public static int sum(int[] arr){
		int sum = 0; //���
		//�����������
		for (int i : arr) {
			sum+=i;
		}
		//���ؽ��
		return sum;
	}

}
