import java.util.*;
public class 字符串顺序比较 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//获取两个字符串
		String str1 = sc.next();
		String str2 = sc.next();
		//传递到result
		System.out.println(result(str1,str2));
	}
	//进行第一次，如果相等，则返回0，否则套娃。
	static int result(String a,String b){
		if (a.equals(b)) {
			return 0;
		}else{
			return(duibi(a,b));
		}
	}
	//套娃判断
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
