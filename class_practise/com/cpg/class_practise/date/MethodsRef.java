package com.cpg.class_practise.date;


@FunctionalInterface
interface reference {
    int lambdaMethodReference(int number);
}
 
    
public class MethodsRef {
	  final private int number;
	    public MethodRef(int number) {
	        this.number = number;
	    }
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
	 
	   

	MethodRef ref =new MethodRef(10);
	
	Reference object = MethodRef::fact;
	int result = object.lambdaMethodReference(10);
	System.out.println(result);

}
