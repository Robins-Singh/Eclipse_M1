package com.cpg.extra.lab5.ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		primeNumber( n);
		sc.close();
	}

	public static void primeNumber(int n) {
		int count;
		for(int i=2;i<n;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					count=1;
			}
			if(count==0)
				System.out.println(" "+i);
				
		}
	}
}
