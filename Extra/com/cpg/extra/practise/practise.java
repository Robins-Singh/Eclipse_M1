package com.cpg.extra.practise;

//public class practise {

	 public class practise { 
	   
	    
	     static boolean isPalindrome(String str) 
	     { 
	   
	         
	         int i = 0, j = str.length() - 1; 
	   
	        
	         while (i < j) { 
	   
	             
	             if (str.charAt(i) != str.charAt(j)) 
	                 return false; 
	   
	             
	             
	             j--; 
	         } 
	   
	     
	         return true; 
	     } 
	   
	    
	     public static void main(String[] args) 
	     { 
	         String str = "geeks"; 
	   
	         if (isPalindrome(str)) 
	             System.out.print("Yes"); 
	         else
	             System.out.print("No"); 
	     } 
	 }

