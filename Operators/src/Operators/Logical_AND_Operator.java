package Operators;

public class Logical_AND_Operator {
	public static void main(String[] args)
    {
        // initializing variables
        int a = 90, b = 20, c = 20, d = 0;
  
        // Displaying a, b, c
        System.out.println("Venku = " + a);
        System.out.println("Rohith = " + b);
        System.out.println("Bhanu = " + c);
  
        
        if ((a < b) && (b == c)) {                  //&& Operator                     
        	d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
}

