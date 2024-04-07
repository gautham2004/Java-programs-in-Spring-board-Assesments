package Assignment5;

public class loanproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int account_number=1001;
        int account_balance=50000000;
        int salary=50000;
        String loan_type="Car";
        int expected_loan_amount=3000000;
        int expected_no_of_EMIs=30;
        int Eligible_Loan_amount=0;
        int Eligible_emis=0;
        
        if(account_number/1000==1)
        {
        	if(account_balance>=1000)
        	{
        		if(salary>25000 && salary<=50000)
        		{
        			Eligible_Loan_amount=500000;
        	        Eligible_emis=36;
        	        System.out.println("Eligible_Loan_amount "+Eligible_Loan_amount);
        	        System.out.println("Eligible_emis "+Eligible_emis);
        		}
        		else if(salary>50000 && salary<=75000)
        		{
        			Eligible_Loan_amount=6000000;
        	        Eligible_emis=60;
        	        System.out.println("Eligible_Loan_amount "+Eligible_Loan_amount);
        	        System.out.println("Eligible_emis "+Eligible_emis);
        		}
        		else if(salary>75000)
        		{
        			Eligible_Loan_amount=7500000;
        	        Eligible_emis=84;
        	        System.out.println("Eligible_Loan_amount "+Eligible_Loan_amount);
        	        System.out.println("Eligible_emis "+Eligible_emis);
        		}
        		else
        		{
        			System.out.println("You are not Eligible");
        		}
        	}
        	else
        	{
        		System.out.println("Your account balance is not sufficient");
        	}
        }
        else
        {
    		System.out.println("Your account first number must start with 1");
        }
	}
}
