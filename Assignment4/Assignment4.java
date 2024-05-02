//Vegetarian and non vegetarian
package Assignment4;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char foodtype='n';
		int unit=1;
		int Quantity=1;
		int distance=12;
		int delcharge=0;
		int amount=0;
		if(foodtype=='v')
		{
			unit=12;
		}
		else if(foodtype=='n')
		{
			unit=15;
		}
		else
		{
			amount=-1;
			System.out.println(amount);
		}
		if(distance>6)
		{
			delcharge=2*(distance-3);
		}
		else if(distance>3 && distance<6)
		{
			delcharge=distance-3;
		}
		else if(distance>0 && distance<=3)
		{
			delcharge=0;
		}
		else
		{
			amount=-1;
		}
		amount=unit*Quantity+delcharge;
		System.out.println("₹"+amount);
	}
}
