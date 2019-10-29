package project_test1;

public class OverloadFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ming = new Student();
        Student hong = new Student();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
	}

}


class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//重载setName方法
	public void setName(String name1,String name2) {
		this.name = name1 + " "+name2;
		
		
		
	}
	
}