package com.cpg.class_practise.date;
class User{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public int getUserId(int idn, char alph) {
		
	}
}
public class UniqueID {
public static String[] generateId(int n, char alph)
{
	
	String[] some=new String[n];
	for(int index=0;index<n;index++){
    
            id+= alph + index;
            some[index]=res;
            alph++;
        }

    
	return some;
}

	
public static void main(String args[]) {
	char alph = 'A';
	UniqueID[] obj = new UniqueID[5] ;
  
    //obj[0] = new Account();
    //obj[1] = new Account();
   for (int index =0;index<5;index++) {
   obj[index].generateId(index);

	// System.out.println(generateId(5));
}
}}

