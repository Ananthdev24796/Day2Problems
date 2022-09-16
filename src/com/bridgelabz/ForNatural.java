 /**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/** 
 * @author Iam_A
 *
 */
public class ForNatural {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
