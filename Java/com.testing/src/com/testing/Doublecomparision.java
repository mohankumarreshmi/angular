package com.testing;

public class Doublecomparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // to be compared
        Double d1 = 10000d;
        Double d2 = 1023d;
        double d3;
        d3 = d1/d2;
        d1=d1*d3;
        d2=d2*d3;
        // function call to compare two double values
        if (Double.compare(d1, d2) == 0) {
 
            System.out.println(d1+" is Equals to "+d2);
        }
        else if (Double.compare(d1, d2) < 0) {
 
            System.out.println(d1+" is lessaer than the "+d2);
        }
        else {
 
            System.out.println(d1+" is Greater than the "+d2);
        }
	}

}
