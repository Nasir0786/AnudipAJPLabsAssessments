package Anudip_Lab_1;

import java.util.Scanner;

public class MaxNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//take input from user
		System.out.println("Enter first num");
		int num_1= sc.nextInt();
		
		System.out.println("Enter Second num");
		int num_2 = sc.nextInt();
		
		//find max number using ternary opeartor
		int max = (num_1 > num_2) ? num_1 : num_2;
		
		System.out.println("Maximum NUmber is"+ max);

	}

}
