package com.cpg.class_practise.date;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		UniqueIdGenerator obj = new UniqueIdGenerator();
		obj.generateId(n);
sc.close();
}
}
