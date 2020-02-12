package com.cpg.extra.lab5.ex2;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		System.out.println(fibonacciWidRecursion( n));
		System.out.println(fibonacciWithoutRecursion( n));
		int value = 0;
		/*for(int index=1;index<=n;index++) {
			value=fibonacciWithoutRecursion(index);
			System.out.print(" "+value);
		}
		*/
		sc.close();
	}

	public static int fibonacciWidRecursion(int n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 1;
		else
			return (fibonacciWidRecursion(n-2) + fibonacciWidRecursion(n-1));
	}
	public static int fibonacciWithoutRecursion(int n) {
		int temp=0;
		if(n<=1)
			return n;
		else {
			
			int fib=1;
			int p_fib=1;
			for(int i=2;i<=n;++i) {
				temp=fib+p_fib;
				fib=p_fib;
				p_fib=temp;
			}
		 return fib;
	}
}}
