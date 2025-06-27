package guviJavaTask4;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2 :");
		int num2 = sc.nextInt();
		
		int swap = num1; 
		
		
		num1=num2;
		num2=swap;
		
		System.out.println("Swapped number 1 : " + num1);
		System.out.println("Swapped number 2 : " + num2);
	}

}
