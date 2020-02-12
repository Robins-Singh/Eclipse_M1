package com.cpg.extra.lab3.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n= sc.nextInt();
		String a[] =new String[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) 
			a[i]=sc.next();
			
		/*for ( int x=0;x<n;x++)
		{
			System.out.println(a[x]);
		}*/
		
		String x[] =new String[n];
		Ex2 obj = new Ex2();
		x=obj.convert(a);
			for (String d:x)
				System.out.println(d);
			
			sc.close();
		}
	
		
		public  String[] convert(String a[]) {
			Arrays.sort(a);
			int size= a.length;
			String arr[]=new String[size];
			if(size%2==0) {
				for(int i=0;i<size/2;i++) 
					arr[i]=a[i].toUpperCase();
				for(int i=size/2;i<size;i++)
					arr[i]=a[i].toLowerCase();
			}
			else {
				for(int i=0;i<(size+1)/2;i++)
					arr[i]=a[i].toUpperCase();
				for(int i=(size+1)/2;i<size;i++)
					arr[i]=a[i].toLowerCase();
			}
			//System.out.println(arr);
			return arr;
		}
	}


