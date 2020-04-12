import java.util.*;

public class Œƒ±æº”√‹ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		EncryptChar(arr);
	}
	public static void EncryptChar(char[] arr){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<90&&arr[i]>=65||arr[i]>=97&&arr[i]<122) {
				arr[i]+=1;
			}else if (arr[i]==90) {
				arr[i]='a';
			}else if (arr[i]==122) {
				arr[i] = 'A';
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
	}
}
