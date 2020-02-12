package com.cpg.class_practise.date;

import java.util.Scanner;

public class UniqueIdGenerator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		UniqueIdGenerator obj = new UniqueIdGenerator();
		obj.generateId(n);
sc.close();
}
	
	public void generateId(int n) {
	char c;
	c='A';
	for(int index = 0; index< n; index++) {{
		
		System.out.println(c+""+index);
		c++;
	}
	}
	
}
	}