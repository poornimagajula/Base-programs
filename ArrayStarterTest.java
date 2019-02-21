package com.regnant;

class ArrayStarter
{
	static void printArrayEle(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf(arr[i]+"  ");
		}
	}
	static void EvenArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.printf(arr[i]+"  ");
			}
		}
	}
	static void OddArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.printf(arr[i]+"  ");
			}
		}
	}
	static void EvenIndex(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.printf(arr[i]+"  ");
			}
		}
	}
	static void oddIndex(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.printf(arr[i]+"  ");
			}
		}
	}
	static void BefMidAft(int arr[])
	{
		int l=arr.length;
		System.out.println("Before Values:");
		for(int i=0;i<l/2;i++) 
		{
			System.out.printf(arr[i]+"  ");
		}
		if(l%2!=0)
		{
			System.out.println("\nMiddle Value:");
			System.out.printf(arr[l/2]+"  ");
			System.out.println("\nAfter Values:");
			for(int i=l/2+1;i<l;i++)
			{
				System.out.printf(arr[i]+"  ");
			}
		}
		else
		{
			System.out.println("\nAfter Values:");
			for(int i=l/2;i<l;i++)
			{
				System.out.printf(arr[i]+"  ");
			}
		}
		
	}
	static void AlterArrayEle(int arr[],int n)
	{
			
		  for(int i=n;i<arr.length;i++)
		  {
			  if(n%2==0)
				  System.out.printf(arr[i++]+"  ");
			  else
				  System.out.printf(arr[i++]+"  ");
		  }
	}
	static int index(int arr[],int n)
	{
		int ret = 0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==n)
				ret = i;
		return ret;		
	}
	static void SumAvg(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println("Sum of the Array Elements:"+sum);
		int avg=sum/arr.length;
		System.out.println("Average of the Array Elements:"+avg);
		
	}
}
class ArrayStarterTest 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		System.out.println("Array Elements:");
		ArrayStarter.printArrayEle(arr);
		System.out.println("\n"+"Even Array Elements:");
		ArrayStarter.EvenArray(arr);
		System.out.println("\n"+"Odd Array Elements:");
		ArrayStarter.OddArray(arr);
		System.out.println("\n"+"Even Index Array Elements:");
		ArrayStarter.EvenIndex(arr);
		System.out.println("\n"+"Odd Index Array Elements:");
		ArrayStarter.oddIndex(arr);
		System.out.println("\n"+"Before & Middle & After Array Elements:");
		ArrayStarter.BefMidAft(arr);
		System.out.println("\n"+"Alternate Array Elements:");
		ArrayStarter.AlterArrayEle(arr,0);
		System.out.println("\n"+"Index of Array Element:");
		int rett=ArrayStarter.index(arr,2);
		System.out.println(rett);
		ArrayStarter.SumAvg(arr);
		
	}

}
