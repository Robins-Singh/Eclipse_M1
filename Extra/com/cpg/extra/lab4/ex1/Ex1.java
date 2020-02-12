package com.cpg.extra.lab4.ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO.");
		int n= sc.nextInt();
		Ex1 obj=new Ex1();
		System.out.println(obj.sumOfCube(n));
		sc.close();
		
	}

	public  int sumOfCube(int n) {
		int counter=0;
		int sum=0;
		while(n!=0) {
			int temp=n%10;
			sum=sum+(temp*temp*temp);
			counter=counter+1;
			n=n/10;
		}
		return sum;
	}
}
