package project_test1;

public class IntToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:
        String s = ""+(char)a+(char)b+(char)c;
        System.out.println(s);
        

	}
	
	
	/*private static String Core(int n) {
        StringBuffer s = new StringBuffer();
        String a;
        char []b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n != 0){
            s = s.append(b[n%16]);
            n = n/16;            
        }
        a = s.reverse().toString();
        return a;
    }*/

}



