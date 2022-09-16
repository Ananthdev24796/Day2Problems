 /**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class Distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value x:");
		int x = sc.nextInt();
//		int x1=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value y:");
		int y = scn.nextInt();
//		int y1=0;
		double distance=0;
		
//		
		distance = Math.sqrt(x*x)+(y*y);
		System.out.println(distance);
		
		

	}

}
