package project_test1;

public class ExceptionThrowPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(tax(2000, 0.1));
		System.out.println(tax(-200, 0.1));
		System.out.println(tax(2000, -0.1));
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("END!");
		}

	}
	
	static double tax(int salary, double rate) {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		if(salary<0||rate<0)
		{
			throw new IllegalArgumentException();
		}
			return salary * rate;
		
		
	}

}
