package com.regnant;

import java.util.Arrays;

 class ArrayMedium
{
	static boolean primeArray(int n)
	{
		  if (n <= 1) 
	       {  
	           return false;  
	       }  
	       for (int i = 2; i <= n/2; i++)
	       {  
	           if (n % i == 0) 
	           {  
	               return false;  
	           }  
	       }  
	       return true;  
	}
	static void reverseArray(int arr[]) 
	{
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.printf(arr[i]+"  ");
		}
	}
	static int dupArray(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					System.out.print(arr[i]+"  ");
					count++;
				}
			}
		}
		return count;
	}
	static int nonRepArray(int arr[],int n)
	{
		int j,flag=0,count=0;
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(arr[i]!=arr[j])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
			{
				System.out.print(arr[i]+"  ");
				count++;
			}				
		}
		return count;
	}
	static void copyArray(int arr[])
	{
		int a[]= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
				a[i]=arr[i];
				System.out.print(a[i]+"  ");
		}
		/* or
		int a[]=arr.clone();
		System.out.println(Arrays.toString(a));*/
	}
	static int noOfRepArrayElement(int arr[],int x,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(x==arr[i])
				count++;
		}
		return count;
	}
	static void delArrayElement(int arr[],int x,int n)
	{
		int flag=0,loc=0;
		for(int i=0;i<n;i++)
		{
			if(x==arr[i])
			{
				flag=1;
				loc=i;
			}
			else
				flag=0;
		}
		if(flag==1)
		{
			for(int j=loc+1;j<n;j++)
			{
				arr[j-1]=arr[j];
			}
			for(int i=0;i<n-1;i++)
			{
				System.out.print(arr[i]+"  ");
			}
		}
		else
			System.out.println("\nElement Not Found");
	}
	static int largNumArray(int arr[],int n)
	{
		Arrays.sort(arr);
		return arr[n-1];
		/* or
		int large=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>large)
				large=arr[i];
		}
		return large;*/
	}
	static int secondLargNumArray(int arr[],int n)
	{
		Arrays.sort(arr);
		return arr[n-2];
		/* or
		int first_large=arr[0],Second_large=arr[0];
		for (int i=1;i<n;i++)
		{
			if(arr[i]>first_large)
			{
				Second_large=first_large;
				first_large=arr[i];
			}
			else if(arr[i]>Second_large)
				Second_large=arr[i];
		}
		return Second_large;*/
	}
	static int NthLargeNumArray(int arr[],int n,int l)
	{
		Arrays.sort(arr);
		return arr[l-n];
	}
	static void InsertPosArrayEle(int arr[],int n,int p,int ele)
	{
		int arr1[] = Arrays.copyOf(arr,n+1); 
		for(int i=n+1;i>=p;i--)
			arr1[i-1]=arr1[i-2];
		arr1[p-1]=ele;
		for(int i=0;i<n+1;i++)
			System.out.print(arr1[i]+"  ");
	}
	static void sortAsc(int arr[],int n)
	{
		Arrays.sort(arr);
		for(int i: arr)
			System.out.print(i+"  ");
	}
	static void sortDsc(int arr[],int n)
	{
		Arrays.sort(arr);
		for (int i=n-1;i>=0;i--)
			System.out.print(arr[i]+"  ");
	}
	static void sortNames(String str[])
	{
		Arrays.sort(str);
		System.out.print(Arrays.toString(str)+"  ");
		
	}
	static int RepArray(int arr[])
	{
		int ele=0;
		aa: for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					ele=arr[j];
					break aa;
				}
			}
			
		}
		return ele;
	}
	
}

public class ArrayMediumTest {

	public static void main(String[] args) 
	{
		int arr[]= {5,8,10,56,24,10,84,75,24,64,8,8};
		String str[]= {"sai","ravi","nitya","chandu"};
		int n=arr.length;
		System.out.println("Prime Number in Array");
		for (int i = 0; i<n; i++) 
	    {  
			if (ArrayMedium.primeArray(arr[i]))
	        {  
	               System.out.printf(arr[i]+"   ");  
	        }  
	    }
		System.out.println("\nReverse the Array Elements");
		ArrayMedium.reverseArray(arr);
		System.out.println("\nDuplicates in Array Elements");
		int count=ArrayMedium.dupArray(arr,n);
		System.out.println("\nDuplicate Count:"+count);
		System.out.println("Non Repeated Array Elements");
		int repcount=ArrayMedium.nonRepArray(arr,n);
		System.out.println("\nNon Repeated Elements Count: "+repcount);
		System.out.println("Copy Elements from one Array to Another Array");
		ArrayMedium.copyArray(arr);	
		System.out.print("\nNo of Repetations of an element in an Array:");
		int rep=ArrayMedium.noOfRepArrayElement(arr,2,n);
		System.out.print(rep);
		ArrayMedium.delArrayElement(arr,5,n);
		int max=ArrayMedium.largNumArray(arr,n);
		System.out.println("Largest Number in Array: "+max);
		int Second_max=ArrayMedium.secondLargNumArray(arr,n);
		System.out.println("Second Largest Number in Array: "+Second_max);
		int N=3;
		int N_max=ArrayMedium.NthLargeNumArray(arr,N,n);
		System.out.println(N+"th Largest Number in Array: "+N_max);
		System.out.println("Insert an Element into a specified position in an Array");
		ArrayMedium.InsertPosArrayEle(arr,n,5,30);
		System.out.println("\nSorting the Array elements in Ascending order");
		ArrayMedium.sortAsc(arr,n);
		System.out.println("\nSorting the Array elements in Descending order");
		ArrayMedium.sortDsc(arr,n);
		System.out.println("\nSorting the Names in Ascending order");
		ArrayMedium.sortNames(str);		
		int element= ArrayMedium.RepArray(arr);
		System.out.println("\nFirst Repeated Array Elements:"+element);
	}
	

}