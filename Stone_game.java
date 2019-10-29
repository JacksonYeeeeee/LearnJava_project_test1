package project_test1;

import java.util.Scanner;

public class Stone_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		System.out.println(random);
		switch (choice-random) {
		// TODO:
		case 0:
			System.out.println("same!");
			break;
		case -1:
		case 2:
			System.out.println("you win!!!");
			break;
		case 1:
		case -2:
			System.out.println("you lose!!!");
			break;
		default:
			System.out.println("!!!");
			break;
		
		
		}

	}

}
