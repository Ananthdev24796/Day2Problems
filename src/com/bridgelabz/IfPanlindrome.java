/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class IfPanlindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,rm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to Check Palindrome");
		int num = sc.nextInt();
		int num1 = num;
		
//		for(int i=0;i<=num;i++)
		for(;num!=0;)
		{
			rm=num%10;
			r=r*10+rm;
			num=num/10;
			
		}
	 System.out.println(r);
	 
	
	if(num1 == r)
	{
		System.out.println("Given Number is panlindrome");
	}
	else
	{
		System.out.println("Given Number is Not panlindrome");
	}

}
	
}

