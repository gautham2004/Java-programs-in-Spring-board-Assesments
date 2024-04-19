//Printing inverted right angle triangle
package iterationassignment8;

public class iterationassignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=0;
		int j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<(n-i);j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
