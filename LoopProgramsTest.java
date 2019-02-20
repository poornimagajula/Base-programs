package com.regnant;
class LoopPrograms 
{
	static void one2ten()
	{
		for(int i=1;i<=10;i++)
			System.out.printf(i+"  ");
	}
	static void ten2one()
	{
		for (int i=10;i>=1;i--)
			System.out.printf(i+"  ");
	}
	static void even(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.printf(i+" ");
		}
	}
	static void odd(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.printf(i+"  ");
		}
	}
	static void prime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int factors=0,j=1;
			while(j<=i) 
			{
				if(i%j==0)
					factors++;
				j++;
			}
			if(factors==2)
				System.out.printf(i+"  ");
		}
	}
	static void alternative(int n)
	{
		for(int i=n;i<=20;i++)
			System.out.printf(i+++"  ");							
	}
	static void divisibleby7(int n)
	{
		for (int i=1;i<=n;i++)
		{
			if(i%7==0)
				System.out.printf(i+"  ");
		}
	}
}

public class LoopProgramsTest 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LoopProgramsTest lp= new LoopProgramsTest();
		System.out.println("1 to 10 Numbers");
		System.out.println("***************");
		LoopPrograms.one2ten();
		System.out.println("\n\n"+"10 to 1 Numbers");
		System.out.println("***************");
		LoopPrograms.ten2one();
		System.out.println("\n\n"+"Even Numbers");
		System.out.println("***************");
		LoopPrograms.even(10);	
		System.out.println("\n\n"+"Odd Numbers");
		System.out.println("***************");
		LoopPrograms.odd(15);
		System.out.println("\n\n"+"Prime Numbers");
		System.out.println("***************");
		LoopPrograms.prime(10);
		System.out.println("\n\n"+"ALternative Numbers");
		System.out.println("***************");
		LoopPrograms.alternative(2);
		System.out.println("\n\n"+"Divisible by 7");
		System.out.println("***************");
		LoopPrograms.divisibleby7(100);
		
	}

}

