package project_test1;

public class ForEachSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n:ns) {
        	sum = sum +n;
            // TODO
        }
        System.out.println(sum); // 55
	}

}
