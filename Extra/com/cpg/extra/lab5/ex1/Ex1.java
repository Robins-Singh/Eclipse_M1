package com.cpg.extra.lab5.ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println(" 1. Red   ::   2. Yellow    :: 3.Green");
		System.out.println("Enter the choice");
		int n=sc.nextInt();
		trafficLight(n);
		sc.close();
	}

	public static void trafficLight(int n) {
		switch(n) {
		case 1: 
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default :
		System.out.println("Invalid Selection");
		}
	}
}
