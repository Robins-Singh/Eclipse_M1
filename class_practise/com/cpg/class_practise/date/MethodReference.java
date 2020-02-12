package com.cpg.class_practise.date;

import java.util.Scanner;

@FunctionalInterface
interface Reference {
    int lambdaMethodReference(int number);
}
	

public class MethodReference{
	public MethodReference() {
    }
    // This method takes a functional interface as the type of its first parameter. Thus it can accept a reference to any instance of that
    // interface, including one created by a method reference
   
    public static void main(String[] args) {
    	MethodReference demo = new MethodReference();
       int result;
       int number = 5;
    result = demo.numCheck(Reference::fact, number);
    System.out.println("Using static method reference: " + number + " factorial: " + result);

    
}

	private int (Reference r, int number) {
		// TODO Auto-generated method stub
		 return r.lambdaMethodReference(number);
	}
}

	public class MethodReference  {
		 

			static int fact(int number) {
				int factorial = 1;
		        for(int i = 1; i <= number; ++i)
		        {
		            // factorial = factorial * i;
		            factorial *= i;
		        }
		        return factorial;
		       // System.out.print(factorial);
					
				}	 

	}