/*
 Implement a program to calculate the product of three positive integer values. 
 However, if one of the integers is 7, consider only the values to the right of 7 for calculation.
 If 7 is the last integer, then display -1.
 Note: Only one of the three values can be 7.
 */
package Assignment3;

public class assignment3 {
	
	public static void main(String[] args)
	{
		int a=7;
		int b=5;
		int c=8;
		int mul=0;
		if(a==7&&b==7||a==7&&c==7||b==7&&c==7)
		{
			System.out.println("Only one of the three values can be seven");
		}
		else
		{
		if(a==7)
		{
			mul=b*c;
			System.out.println(mul);
		}
		else if(b==7)
		{
			mul=c;
			System.out.println(mul);
		}
		else if(c==7) 
		{
			System.out.println("-1");	
		}
		else
		{
			mul=a*b*c;
			System.out.println(mul);
		}
		}
	}
}
