import java.util.*;
public class �ַ���˳��Ƚ� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//��ȡ�����ַ���
		String str1 = sc.next();
		String str2 = sc.next();
		//���ݵ�result
		System.out.println(result(str1,str2));
	}
	//���е�һ�Σ������ȣ��򷵻�0���������ޡ�
	static int result(String a,String b){
		if (a.equals(b)) {
			return 0;
		}else{
			return(duibi(a,b));
		}
	}
	//�����ж�
	static int duibi(String a,String b){
		int x = a.charAt(0);
		int y = b.charAt(0);
		if (x<y) {
			return -1;
		}else if(x>y){
			return 1;
		}else if (a.length()==1&&b.length()>1) {
			return -1;
		}else if (a.length()>1&&b.length()==1){
			return 1;
		}else{
			return duibi(a.substring(1),b.substring(1));
		}
	}

}
