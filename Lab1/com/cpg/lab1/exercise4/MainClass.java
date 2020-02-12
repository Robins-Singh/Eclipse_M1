package com.cpg.lab1.exercise4;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the No:");
		 int n = sc.nextInt();
		 ExerciseFour obj=new ExerciseFour();
		 boolean z=obj.powerOf2(n);
		  System.out.println(z);
		  sc.close();
		 }
}
