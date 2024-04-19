//checking a number is lucky or not by dividing it with 9
package iterationassignment6;

public class iterationassignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		int org=num;
		int i=0;
		int sum=0;
		int count=0;
		while(num>0)
		{
			i=num%10;
			num=num/10;
			if(count==0||count%2==0)
			{
				sum=sum+(i*i);
			}
			count++;
		}
		//System.out.println(sum);
		if(sum%9==0)
		{
			System.out.println("The number "+org+" is a lucky number");
		}
		else
		{
			System.out.println("The number is not a lucky number");
		}
	}
}
