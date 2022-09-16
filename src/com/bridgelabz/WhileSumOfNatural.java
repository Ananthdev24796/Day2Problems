/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A 
 *
 */
public class WhileSumOfNatural {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		int i=1;
		while (i<=number)
		{
			System.out.println(i);
			sum = sum+i;
			i++;
			
		}
		
		System.out.println("sum of Natural number" +sum);
	}

}
