package Assingment7;

public class date_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to print next date if it is valid
		int day=1;
		int month =9;
		int year=15;
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)//checking validation for 31 days month
		{
		    if(day>0&&day<31)
		    {
		        System.out.println(day+1+"-"+month+"-20"+year);
		    }
		    else
		    {
		        System.out.println("Enter a vaild date");
		    }
		}
		else if(month==2)//checking validation for February month
		{
		    if(year%4==0)
		    {
		        if(day>0&&day<29)
		       {
		          System.out.println(day+1+"-"+month+"-20"+year);
		       }
		       else
		       {
		           System.out.println("Enter a vaild date");
		       }
		    }
		    else 
		    {
		         if(day>0&&day<28)
		       {
		          System.out.println(day+1+"-"+month+"-20"+year);
		       }
		       else
		       {
		           System.out.println("Enter a vaild date");
		       }
		    }
		}
		else//for remaining months
		{
		     if(day>0&&day<30)
		    {
		        System.out.println(day+1+"-"+month+"-20"+year);
		    }
		    else
		    {
		        System.out.println("Enter a vaild date");
		    }
		}
	}
}
