 /**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class SwitchVowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter to check vowel");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
			case 'a':
				System.out.println(ch +  "\s"+  "is vowel");
				break;
		
			case 'A':
		
				System.out.println(ch +  "\s"+ "is vowel");
				break;
				
			case 'e':
				System.out.println(ch +  "\s"+"is vowel");
				break;
			case 'E':
				System.out.println(ch +  "\s"+"is vowel");
				break;
			case 'i':
				System.out.println(ch +  "\s"+"is vowel");
				break;
			case 'I':
				System.out.println(ch +  "\s"+"is vowel");
				break;
			case 'o':
				System.out.println(ch+  "\s" +"is vowel");
				break;
			case 'O':
				System.out.println(ch +  "\s"+"is vowel");
				break;
			case 'U':
				System.out.println(ch +  "\s"+"is vowel");
				break;
			case 'u':
				System.out.println(ch+  "\s" +"is vowel");
				break;
			default :
				System.out.println(ch+  "\s" + "is consonant");
				break;
			}
		}
	}
