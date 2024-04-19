//checking if a number is divisible by its sum of digits
package iterationassignment3;

public class iterationassignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2250;
		int org=num;
		int i=0;
		int sum=0;
		while(num>0)
		{
		    i=num%10;
		    sum=sum+i;
		    num=num/10;
		}
		if(org%sum==0)
		{
		    System.out.println(org+" is divisible by sum of its digits");
		}
		else
		{
		    System.out.println(org+" is not divisible by sum of its digits");
		}

	}

}
