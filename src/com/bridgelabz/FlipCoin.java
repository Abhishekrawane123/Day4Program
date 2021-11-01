package com.bridgelabz;


	import java.util.Scanner;

	public class FlipCoin {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("how many times you want to flip the coin Enter positive number");
			int n=sc.nextInt();
			
			flipCoin(n);
			
			

		}
		
		static void flipCoin(int NumberOfTimes)
		{
			int countHead=0;
			int countTail=0;
			float percentH;
			float percentT;
			for (int i = 0; i < NumberOfTimes; i++)
			{
				if(Math.random()<0.5)
				{
					countHead++;
				}
				else
				{
					countTail++;
				}
			}
			
			System.out.println("Number of head = "+countHead);
			System.out.println("Number of tail = "+countTail);
			
			percentH=(countHead*100)/NumberOfTimes;
			percentT=(countTail*100)/NumberOfTimes;
			
			System.out.println("Percent of head "+percentH);
			System.out.println("Percent of Tail "+percentT);
			
			
		}

	}


