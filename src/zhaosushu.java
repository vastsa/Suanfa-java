import java.util.*;
import java.math.*;
public class zhaosushu {

	/**
	 * @param args
	 * ���� �㷨��� ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l =sc.nextInt();
		int r = sc.nextInt();
		int num=0,j;
		boolean sgin;
		 for (int i = l; i <= r; i++) {
	            if(i % 2 == 0 && i != 2  )  continue; //ż����1�ų�
	            sgin= true;
	            for (j = 2; j <= Math.sqrt(i) ; j++) {
	                if (i % j == 0) {
	                    sgin = false;
	                    break;
	                }
	            }
	            //��ӡ
	            if (sgin) {
	                num++;
	            }
	        }
		System.out.println(num);
	}

}
