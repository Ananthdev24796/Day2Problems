/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class IfElseUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if(num == 1)
		{
			System.out.println("unit");
		}
		else if(num == 10)
		{
			System.out.println("Ten");
		}
		else if(num == 100)
		{
			System.out.println("Hundred");
		}
		else if(num == 1000)
		{
			System.out.println("Thousand");
		}
		else if(num == 10000)
		{
			System.out.println("Ten thousand");
		}
		else 
		{
			System.out.println("Enter valid number");
		}
		

	}

}
