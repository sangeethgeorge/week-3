package Week3;

import java.util.Scanner;

public class EvenNumSum {

	private static Scanner scan;

	public static void main(String[] args)
	{
			System.out.println("Enter an integer from 2 and above:");
		    scan = new Scanner (System.in);
			int val = scan.nextInt();
			while(val < 2)
			{
				System.out.println("Integer must be 2 or above: ");
				scan = new Scanner(System.in);
				int val1 = scan.nextInt();	
				if(val1 >= 2)
				{
					int limit = (val1);
					int sum = 0;
					for(int i=2; i<=limit;i++)
					{
						sum = sum + i++;
				
					}
					System.out.println("Sum of even numbers: "+ sum);
					System.exit(0);

				}
			}	
			
	}

}
