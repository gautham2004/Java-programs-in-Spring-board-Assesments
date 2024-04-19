//Checking if a number is a seed of another number
package iterationassignment4;

public class iterationassignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		int seedof=1000;
		int org=num;
		int pro=1;
		int i=0;
		int total=0;
		
		while(num>0)
		{
			i=num%10;
			pro=pro*i;
			num=num/10;
		}
		
		total=pro*org;
		if(total==seedof)
		{
			System.out.println(org+" is the seed of "+seedof);
		}
		else
		{
			System.out.println(org+" is not the seed of "+seedof);
		}
	}
}
