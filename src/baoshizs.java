import java.util.Scanner;


public class baoshizs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		String str1;
		switch (hour) {
		case 1:
			str1="zero";
			break;
		case 2:
			str1="two";
			break;
		case 3:
			str1="three";
			break;
		case 4:
			str1="four";
			break;
		case 5:
			str1="five";
			break;
		case 6:
			str1="six";
			break;
		
		default:
			break;
		}
	}

}
