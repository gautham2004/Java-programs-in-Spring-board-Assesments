/*
  Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

Find the discriminant value using the formula given below.

discriminant = b2 - 4ac

If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

Use the formula given below to find the roots of a quadratic equation.

x = (-b ± discriminant)/2a
 */
package Assignment2;

public class Assignment2 {
	
	public static void main (String[] args)
	{
		int a=1;
		int b=4;
		int c=4;
		float x=0,x1=0,x2=0;
		float discriminant=0;
		discriminant=(b*b)-(4*a*c);
		if(discriminant==0)
		{
			x=(-b + discriminant)/2*a;
			System.out.println("The root is: "+x);
		}
		else if(discriminant>0)
		{
			x1 = (-b + discriminant)/2*a;
			x2 = (-b - discriminant)/2*a;
			System.out.println("The first root is: "+x1);
			System.out.println("The second root is: "+x2);
			
		}
		else
		{
			System.out.println("The equation has no real root");
		}	
	}
}
