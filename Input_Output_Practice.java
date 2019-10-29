package project_test1;

import java.util.Scanner;

public class Input_Output_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the previous score: ");
		int preScore = sc.nextInt();
		System.out.print("please enter the current score: ");
		int currentScore = sc.nextInt();
		float percent = (currentScore-preScore)*100/preScore;
		if(percent<0.0)
		{
			System.out.print("It has decreased(%) ");
			System.out.printf("%.2f",percent);
		}else {
			System.out.print("It has increased(%) ");
			System.out.printf("%.2f",percent);
		}

	}

}
