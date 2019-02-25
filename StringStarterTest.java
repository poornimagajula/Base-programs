package com.regnant;

class StringStarter
{
	static int NoofWords(String str)
	{
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
				count++;
			/*else if(str.charAt(i+1)!=' ')
				count++;*/
		}
		return count;
	}
	static String RemSpace(String str)
	{
		String rem_space=str.replaceAll(" ", "");
		return rem_space;
	}
	static void InttoString()
	{
		String str = "100";
		int x=Integer.parseInt(str);
		System.out.println("String to Integer: "+x);
		String s= String.valueOf(x);
		System.out.println("Integer to string: "+ s);
	}
	static char fistNonRepChar(String str)
	{
		char ch='e';
		aa: for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++) 
			{
				if(str.charAt(i)!=str.charAt(j)) 
				{
					ch=str.charAt(j); 
					break aa; 
				}    
			}           
				
		}
		return ch;
	}
	static int VowNCons(String str)
	{
		int Vow_count=0,Cons_Count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				Vow_count++;
			else
				Cons_Count++;
		}
		System.out.println("Consonents Count:"+Cons_Count);
		return Vow_count;
	}
	static void Pallindrome(String str)
	{
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1))
			System.out.println("String is Pallindrome");
		else
			System.out.println("String is Not a Pallindrome");
	}
	static void toUpp_toLow(String str)
	{
		System.out.println("Upper Case: "+str.toUpperCase()+"\n"+"Lower Case: "+str.toLowerCase());
	}
	static String ReverseStr(String str)
	{
		String rev_str="";
		for(int i=str.length()-1;i>=0;i--)
			rev_str=rev_str+str.charAt(i);
		return rev_str;
	}
	static void swap(String str,String s)
	{
		String swap_str=str+s;
		s=swap_str.substring(0,str.length());
		str=swap_str.substring(str.length());
		System.out.print(str+"\t"+s);
		
	}
	
}

public class StringStarterTest 
{
	public static void main(String[] args) 
	{
		String str="Welcome to the String Programs";
		String S="poornima";
		int count= StringStarter.NoofWords(str);
		System.out.println("No of Words in a String "+count);
		System.out.println("Remove whitespaces in a String");
		String rem_str=StringStarter.RemSpace(str);
		System.out.println(rem_str);
		StringStarter.InttoString();
		char ch=StringStarter.fistNonRepChar(S);
		System.out.println("First Non Repeating Character:\t"+ch);
		int Vow_Count=StringStarter.VowNCons(rem_str);
		System.out.println("Vowels Count:"+Vow_Count);
		StringStarter.Pallindrome(S);
		StringStarter.toUpp_toLow(str);
		String Rev=StringStarter.ReverseStr(S);
		System.out.println("Reverse String: "+Rev);
		System.out.println("Swapping of two Strings:");
		StringStarter.swap(str,S);
		

	}

}
