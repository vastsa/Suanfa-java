public class ÕÒ¹«±¶Êý {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        for (int i=offset; i<str.length;i++ ) {
            System.out.print(str[i]);
        }
        for (int i =0;i<=offset ;i++ ){
            System.out.print(str[i]);
        } 
    }
}