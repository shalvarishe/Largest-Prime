//Shalva Rishe

import java.util.Scanner;
public class LargestPrime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int largestPrime=1;
		System.out.print("Enter a number (negative to quit) ");
		int num=input.nextInt();
		while (num>=0)
		{
			int count=2;
			String prime="yes";
			while (count<num && prime.equals("yes"))
			{
				int remainder=num%count;
				if (remainder==0)
				{
					prime="no";
				}
				else
				{
					count+=1;
				}
			}
			if (prime.equals("yes") && num>largestPrime)
			{
				largestPrime=num;
				System.out.print("Enter a number (negative to quit) ");
				num=input.nextInt();
			}
			else
			{
				System.out.print("Enter a number (negative to quit) ");
				num=input.nextInt();
			}
		} //end while (num>=0)
		
		if (largestPrime==1)
		{
			System.out.println("No prime numbers entered.");
		}
		else
		{
			System.out.println("The largest prime number entered was "+largestPrime+".");
		}
		

	}

}
