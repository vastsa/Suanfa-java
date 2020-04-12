import java.util.*;
public class P1102 {

	/**
	 * @param args
	 */
	public static class stu{
		public String name;
		public String sex;
		public int age;
		public int grade;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		stu[] stu = new stu[n];
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new stu();
			stu[i].name = sc.next();
			stu[i].sex = sc.next();
			stu[i].age = sc.nextInt();
			stu[i].grade = sc.nextInt();
		}
		for (int i = 0; i < stu.length-1; i++) {
			for (int j = 0; j < stu.length-i-1; j++) {
				if (stu[j].grade>stu[j+1].grade) {
					stu temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
			}
		}
		for (stu stu2 : stu) {
			System.out.println(stu2.name+" "+stu2.sex+" "+stu2.age+" "+stu2.grade);
		}
	}

}
