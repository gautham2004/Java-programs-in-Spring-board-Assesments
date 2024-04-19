//Finding number of chickens and rabbits
package iterationassignment2;

public class iterationassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int heads=150;
		int legs=500;
		int rabbits=(legs-2*heads)/2;
		int chickens=heads-rabbits;
		
		if(legs%2==1||rabbits<0||chickens<0)
		{
		    System.out.println("The number of chickens and rabbits cannot be found");
		}
		else
		{
		    System.out.println("Chickens ="+chickens+"\nRabbits ="+rabbits);
		}

	}

}
