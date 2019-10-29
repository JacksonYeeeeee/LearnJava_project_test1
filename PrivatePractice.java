package project_test1;

public class PrivatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Person1 ming = new Person1();
	     ming.setName("ะกร๗");
	     ming.setAge(12);
	     System.out.println(ming.getAge());

	}

}

class Person1{
	private String name;
	private double age;
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getAge()
	{
		return this.age;
	}
	public void setAge(double age) {
		this.age = age;
	}
}
