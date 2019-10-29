package project_test1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter your weight(kg)");
		double weight = sc.nextDouble();
		System.out.print("please enter your height(m)");
		double height = sc.nextDouble();
		double BMI = weight/(height*height);
		if(BMI<18.5) {
			System.out.println("过轻！");
			
		}else if(BMI>=18.5&&BMI<25) {
		    System.out.println("正常！");
		}else if(BMI>=25&&BMI<28) {
			System.out.println("过重！");
		}else if(BMI>=28&&BMI<32) {
			System.out.println("肥胖！");
		}else {
			System.out.println("非常肥胖！");
		}

	}

}
