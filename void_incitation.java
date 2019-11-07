package project_test1;

import java.util.Arrays;

public class void_incitation {
    public static void main(String[] args) {
    	int []scores = new int[] {10,20,30,40};
    	Score ss = new Score(scores);
    	ss.printScore();
    	scores[1] = 25;
    	ss.printScore();
    	
    	
    }
}

class Score{
	private int []scores1;
	//构造方法
	public Score(int[]scores) {
		/*scores1 = new int[scores.length];
		
		for(int i = 0;i<scores.length;i++)
		{
			scores1[i] = scores[i];
		}*/
		
		scores1 = scores.clone();
		
	}
	
	//打印数组的方法
	public void printScore()
	{
		System.out.println(Arrays.toString(scores1));
	}

}
