package com.cpg.extra.lab3.ex1;

import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]= new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//int arr[]= sc.nextInt();
		ex1 obj=new ex1();
		int d_arr= obj.getSecondSmallest(a);
		System.out.println(d_arr);
		sc.close();
	}

	public static int getSecondSmallest(int a[]) {
		Arrays.sort(a);
		return a[1];
	}
}
