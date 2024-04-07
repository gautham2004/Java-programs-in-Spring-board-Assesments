package Assingment8;

public class multipleof_3_or_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int num=3;
		
		if(num%3==0 && num%5==0)
		{
		    System.out.println("Zoom");
		}
		else if(num%3==0)
		{
		     System.out.println("Zip");
		}
		else if(num%5==0)
		{
		     System.out.println("Zap");
		}
		else
		{
		     System.out.println("Invaild");
		}
	}
}
