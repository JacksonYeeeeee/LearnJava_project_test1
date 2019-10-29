package project_test1;

public class ForToPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//利用无穷级数：pi=2*（1/1+1/3+1*2/(3*5)+...）
		int a = 10000;
		int m = 3;
		int n = 1;
		double t = 1;
		double sum = 1;
		for (int i = 0;i<a;i++)
		{
			t = t*n/m;
			sum = sum + t;
			m+=2;
			n++;
		}
		
		System.out.println("pi="+2*sum);
		
		//割圆术怎么求pi？

	}

}
