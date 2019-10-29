package project_test1;

public class ConstructFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("xioaming",20);
		System.out.println(person.getAge());
		System.out.println(person.getName());
		

	}

}

class Person{
	private String name;
	private int age;
	
	//对应的get和set函数
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//构造方法
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}
