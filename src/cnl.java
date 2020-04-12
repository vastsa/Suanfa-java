
public class cnl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 11; i < 25; i++) {
			int ls=(i*i*i);
			int scf = i*i*i*i;
			String lss = ""+ls;
			String scfs = ""+scf;
			if (lss.length()==4&&scfs.length()==6) {
				System.out.println(i);
				System.out.println(lss);
				System.out.println(scfs);
			}
		}
	}

}
