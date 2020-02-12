package com.cpg.extra.lab5.ex4;

public class Exception {
	String first_name;
	String last_name;


	Exception(String f_name,String l_name){
		try {
			if((f_name.isEmpty()) && (l_name.isEmpty()) ) 
				throw new notvalid();
		
		else {
			first_name=f_name;
			last_name=l_name;
		}}
		
			catch(notvalid nv) {
				System.out.println(nv);
			}
		void display() {
			System.out.println("First name is" first_name);
			System.out.println("last name is" last_name);
		}
	}
		
		

	
		//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


