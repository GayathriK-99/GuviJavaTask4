package guviJavaTask4;

import java.util.Scanner;

public class SeniorCitizenCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();		
		
		if(age>=60)
		{
			System.out.println("Senior Citizen");
		}
		else 
		{
			System.out.println("Not Senior Citizen");
		}

	}

}
