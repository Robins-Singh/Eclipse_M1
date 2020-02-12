package com.cpg.extra.lab3.ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		String a[] =new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		sc.close();
	}

	public static String[] occurence(String a[]) {
		int size=a.length;
		int count=0;
		String arr[]=new String[size];
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(arr.charAt(i)==arr.charAt(j))
					count=count+1;
				count++;
			}
		}
		
		
		return ;
		
	}
}
