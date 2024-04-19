//checking palindrome for a number
package Iterationassignment1;

public class iterationassignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=131;
		int org=num;
		int i=0;
		int rev=0;;
		
		while(num>0)
		{
		    i=num%10;
		    rev=(rev*10)+i;
		    num=num/10;
		}
		if(org==rev)
		{
		    System.out.println(org+" is a palindrome");
		}
		else
		{
		    System.out.println(org+" is not a palindrome");
		}

	}

}
