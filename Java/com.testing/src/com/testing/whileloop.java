package com.testing;

public class whileloop {

	public static void main(String[] args) {
		int input= 10;
		int i = 1;
		  System.out.println("programme to print each number of inputs and checking the condition untill input ends");
        // test expression
        while (i < input)
        	{
        		for(int k=1; k<=i; k++)
        		{
        			for(int s=1;s<=k;s++)
        			{
        				System.out.println("                                     ---"+s+"---");
        			}
        		System.out.println("------K="+ k+" at for_Loop "+ k+" step");
        		}
        	System.out.println("****The End of "+i+" step in While loop i value is: "+i);
        	i++;
        	}
}

}
