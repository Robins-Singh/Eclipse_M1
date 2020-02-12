package com.cpg.extyra.lab3.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Ex3 obj=new Ex3();	
		
	   for(int x:obj.getSorted(a)) {
		   System.out.println(x);
		
		}
	}
	public static int[] getSorted(int a[]) {
		int rem, j=0, rev=0;
		int size=a.length;
		int arr[]=new int[size];
		//
		for(int i=0;i<size;i++) {
			while( a[i]!=0){
			rem=a[i]%10;
			rev=rev*10+rem;
			a[i]=a[i]/10;
			}
			arr[j]=rev;
			rev = 0;
			j++;
		}
		
	
		Arrays.sort(arr);
		return arr;

}}
