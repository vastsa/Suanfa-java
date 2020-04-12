import java.util.*;

public class ÌÔÌÔµÄÃûµ¥ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] names = new String[n];
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
			if (names[i].equals("WYS")) {
				System.out.println("KXZSMR");
			} else if (names[i].equals("CQ")) {
				System.out.println("CHAIQIANG");
			} else if (names[i].equals("LC")) {
				System.out.println("DRAGONNET");
			} else if (names[i].equals("SYT") || names[i].equals("SSD")
					|| names[i].equals("LSS") || names[i].equals("LYF")) {
				System.out.println("STUDYFATHER");
			} else {
				System.out.println("DENOMINATOR");
			}
		}
	}
}
