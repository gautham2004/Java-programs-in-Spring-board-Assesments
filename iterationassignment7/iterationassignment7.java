//Finding LCM for the given two numbers
package iterationassignment7;

public class iterationassignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		int num2=10;
		if(num1%num2==0||num2%num1==0)
		{
			if(num1>num2)
			{
				System.out.println(num1);
			}
			else
			{
				System.out.println(num2);
			}
		}
		else
		{
			System.out.println(num1*num2);
		}
	}
}
