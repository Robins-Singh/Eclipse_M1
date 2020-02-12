package com.cpg.lab7.exercise3;
import java.util.*; 
public class CollectionsSquare { 
	static void calculateSquare(int[] input) 
	{ 
		HashMap<Integer, Integer> CalculateSq 
			= new HashMap<Integer, Integer>(); 			
		for (int i : input) { 
				CalculateSq.put(i,i*i); 
			} 
		// Printing the charCountMap 
		for (Map.Entry entry : CalculateSq.entrySet()) { 
			System.out.println(entry.getKey() + " : " + entry.getValue()); 
		}
	}
	// Driver Code 
	public static void main(String[] args) 
	{ 
		int[] input = {4,5,7,8}; 
		calculateSquare(input); 
	} 
}