package com.cpg.extra.lab5.ex2;

import java.util.Scanner;

public class Ex2modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		System.out.println(fib(n));
		System.out.println(fibw(n));
		sc.close();
	}

	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			int x=fib(n-2)+fib(n-1);
			return x;
		}
	}
	public static int fibw(int n) {
		int fibo=1;
		int p_fibo=1;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			for(int i=2;i<n;i++) {
				int temp=fibo;
				fibo=fibo+p_fibo;
				p_fibo=temp;
			}
			return fibo;	
		}
	}
}
