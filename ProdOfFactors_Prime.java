package test_02_04_25;

import java.util.Scanner;

public class ProdOfFactors_Prime 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int temp = num;
		int prod = 1;
		for(int i=1;i<=temp;i++)
		{
			if(temp%i==0)
				prod *= i;
		}
		if(isPrime(prod))
			System.out.println("Product Of Factors is " + prod + ". It is Prime");
		else
			System.out.println("Product Of Factors is " + prod + ". It is Not a Prime");
	}
	public static boolean isPrime(int num)
	{
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else 
			return false;
	}
}
