package project_test1;

public class ScoreAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double sum = 0;
        for(int i = 0;i<scores.length;i++)
        {
        	for(int j = 0;j<scores[i].length;j++)
        	{
        		sum +=scores[i][j];
        	}
        }
        double average = sum/(scores.length*scores[0].length);
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
	}

}
