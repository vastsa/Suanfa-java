import java.util.*;

public class ³É¼¨ÅÅÃû {
	public static class student{
		public String name;
		public int grade;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		student[] stu = new student[n];
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new student();
			stu[i].name = input.next();
			stu[i].grade = input.nextInt();
		}
		for (int i = 0; i < stu.length-1; i++) {
			for (int j = 0; j < stu.length-1-i; j++) {
				if (stu[j].grade<stu[j+1].grade) {
					student temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}else if (stu[j].grade==stu[j+1].grade) {
					int k =0;
					while (stu[j].name.charAt(k)==stu[j+1].name.charAt(k)) {
						k++;
						if (stu[j].name.length()==k) {
							k--;
							break;
						}
					}
					if (stu[j].name.charAt(k)>stu[j+1].name.charAt(k)) {
						student temp = stu[j];
						stu[j] = stu[j+1];
						stu[j+1] = temp;
					}
				}
			}
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name);
		}
	}

}
