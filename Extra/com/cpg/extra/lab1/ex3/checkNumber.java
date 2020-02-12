package com.cpg.extra.lab1.ex3;
import java.util.*;
public class checkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		checkNumber obj=new checkNumber();
		boolean x=obj.checkNo(n);
		System.out.println(x);
		sc.close();
	}
	
	public static boolean checkNo(int n) {
		int max_digit=9;
		boolean inc_digit=true;
		while(n>0) {
			int c_digit=n%10;
			n=n/10;
			if(c_digit > max_digit) {
				inc_digit=false;
			}
			max_digit=c_digit;
			
		}
		return inc_digit;
	}

}
