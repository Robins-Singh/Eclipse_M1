package com.cpg.class_practise.date;

@FunctionalInterface
	interface MyInterface {
	    String reverse(String n);
	}
	
	
	public class FormatString { 
	    public static void main(String args[]) {
	        MyInterface myInterface = (str) -> {
	            String result = "";
	            for (int i = 0; i <str.length() ; i++)
	            result += str.charAt(i) + " ";
	            return result;
	        };
	        System.out.println("Lambda = " + myInterface.reverse("Lambda"));
	    }
	}


