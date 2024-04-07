package Assingment6;

public class notes_needed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dollar1=3;
		int dollar5=3;
		int purchase_amount=19;
		
		int i=purchase_amount/5;
		int j=purchase_amount%5;
		if(j<=dollar1)
		{
		    System.out.println("$1 notes needed ="+j);
		    System.out.println("$5 notes needed ="+i);
		}
		else
		{
		    System.out.println("-1");
		}

	}

}
