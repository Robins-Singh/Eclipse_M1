package com.cpg.extra.lab1.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		
		System.out.println(checkNumber(n));
		sc.close();
		
	}
	public static boolean checkNumber(int n) {
		boolean check=true;
		if(n<=0) {
			return false;
		}
		while(n>1) {
			if(n%2!=0) {
				return false;
			}
				n=n/2;
			
		}
		return true;
	}

}
