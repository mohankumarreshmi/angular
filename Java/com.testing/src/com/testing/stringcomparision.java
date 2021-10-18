package com.testing;

public class stringcomparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "mohan";
		String s2 = "MOHAN";
		String s3 = "Deepthi";
		
		System.out.println(s1+" - Comparing with " +s2+" Result is: " +s1.equals(s2));
		System.out.println(s1+" - Comparing with " +s3+" Result is: " +s1.equals(s3));
		System.out.println(s1+" - Comparing with ignore case " +s2+" Result is: " +s1.equalsIgnoreCase(s2));
		
	//Operator Using	
		 String s11="Mohan";  
		   String s22="Mohan";  
		   String s33=new String("Mohan");  
		   System.out.println(s11==s22);
		   System.out.println(s11==s33);
		   
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
	}

}
