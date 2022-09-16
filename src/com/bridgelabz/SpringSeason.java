/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class SpringSeason {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value m");
		int m = sc.nextInt();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value d");
		int d = sc.nextInt();
		
		if (d >= 20  && m >=3 && m <=6)
		{
			System.out.println("True");
		}
		else
			System.out.println("false");
		}

}
