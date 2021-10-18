package com.testing;

public class loopings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=26;
int b=10;


if (a-b<5){
	System.out.println("Result is lesser than 5");
	}
else if (a-b<10) {
	System.out.println("Result is lesser than 10 greater than 5");
}
else
{System.out.println("Result is greater than 10...");
	}
System.out.println("Value of A is: "+a);
System.out.println("Value of B is: "+b);
int c = a +b ;
System.out.println("Value of Result as C is: "+c);
int n1 = 5, n2 = 10, max;

System.out.println("First num: " + n1);
System.out.println("Second num: " + n2);

// Largest among n1 and n2
max = (n1 > n2) ? n1 : n2;

// Print the largest number
System.out.println("Maximum is = " + max);
}
}