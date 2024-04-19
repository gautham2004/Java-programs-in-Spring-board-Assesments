//checking if a number is an Armstrong number or not
package iterationassignment5;

public class iterationassignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;
		int org=num;
		int i=0;
		int sum=0;
		while(num>0)
		{
			i=num%10;
			sum=sum+(i*i*i);
			num=num/10;
		}
		System.out.println(sum);
		if(org==sum)
		{
			System.out.println(org+" is an Armstrong number");
		}
		else
		{
			System.out.println(org+" is not an armstrong number");
		}

	}

}
