
/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class ArithmeticOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b= 20;
		int c =30;
		int t1,t2,t3,t4;
		
		// 1. a+b*c
		
		t1 = a+b*c;
		System.out.println(t1);
		
		//2.c+a/b
		t2=c+a/b;
		System.out.println(t2);
		
		//3.a%b+c
		t3=a%b+c;
		System.out.println(t3);
	
		//4.a*b+c
		t4=a*b+c;
		System.out.println(t4);
		// to check max
		
		if (t1>=t2 && t1>=t3 && t1>t4){
			System.out.println(t1 + "is maxmium ");
			}	
		else if (t2>=t1 && t2>=t3 && t2>=t4) {
			System.out.println(t2 +"is maximum");
		}
		else if (t3>=t1 && t3>=t2 && t3>=t4) {
			System.out.println(t3 +"is maximum");
		}
		else if(t4>=t1 && t4>=t2 && t4>t3) {
			System.out.println(t4 +"is maximum");
		}
		
		// to check minimum
		
		if (t1<=t2 && t1<=t3 && t1<=t4){
			System.out.println(t1 + "is miniium ");
			}	
		else if (t2<=t1 && t2<=t3 && t2<=t4) {
			System.out.println(t2 +"is miniium");
		}
		else if (t3<=t1 && t3<=t2 && t3<=t4) {
			System.out.println(t3 +"is miniium");
		}
		else if(t4<=t1 && t4<=t2 && t4<=t3) {
			System.out.println(t4 +"is miniium");
		}
		}
		}
		
		

	
