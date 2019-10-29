package project_test1;

public class Interface_Income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary2 salary = new Salary2(9000);
		DraftFee2 draftfee = new DraftFee2(8000);
		
		System.out.println(salary.getTax()+draftfee.getTax());

	}

}

interface Income2{
	
	public abstract double getTax();
}

class Salary2 implements Income2{
	
	protected double income;
	public Salary2(double income)
	{
		this.income = income;
	}
	
	
	@Override
	public double getTax() {
		return (income-5000)*0.2;
	}
}

class DraftFee2 implements Income2{
	
	protected double income;
	
	public DraftFee2(double income)
	{
		this.income = income;
	}
	
	
	@Override
	public double getTax() {
		return income*0.2;
	}
}