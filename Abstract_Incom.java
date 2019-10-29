package project_test1;

public class Abstract_Incom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Salary1 salary = new Salary1(9000);
		DraftFee1 draftfee = new DraftFee1(8000);
		
		System.out.println(salary.getTax()+draftfee.getTax());*/
		
		Income1 [] incomes = new Income1[] {
				new Salary1(9000),
				new DraftFee1(8000)
			
		};
		
		
			double totalTax = 0;
		
		    for(Income1 incomess:incomes)
		      {
			     totalTax+=incomess.getTax();
		      }
		
		    System.out.println(totalTax);

	}

}

abstract class Income1{
	
	protected double income;
	public Income1(double income)
	{
		this.income = income;
	}
	
	public abstract double getTax();
}

class Salary1 extends Income1{
	
	
	public Salary1(double income)
	{
		super(income);
	}
	
	
	@Override
	public double getTax() {
		return (income-5000)*0.2;
	}
}

class DraftFee1 extends Income1{
	
	public DraftFee1(double income)
	{
		super(income);
	}
	
	
	@Override
	public double getTax() {
		return income*0.2;
	}
}