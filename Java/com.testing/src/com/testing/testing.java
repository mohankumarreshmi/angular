package com.testing;
public class testing {  
public static void main(String[] args) {  
	for(int i=1;i<=50;i++){  
		for(int j=50;j>=i;j--){  
		        System.out.print("> ");  
		}  
		System.out.println();//new line  
		}  
	for(int i=1;i<=50;i++){  
		for(int j=1;j<=i;j++){  
		        System.out.print("< ");  
		}  
		System.out.println();//new line  
		}  
    int arr[]={12,23,44,56,78};  
    //Printing array using for-each loop  
    for(int i:arr){  					
        System.out.println(i);  
    }  
    //printing label for loop
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==3&&j==3){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  

    
		}  
		}  