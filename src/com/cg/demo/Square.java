package com.cg.demo;
public class Square 
{
	public static void main(String[] args) {
		
		
		int base=2;
		int raise=3;
		
		
		int pow=power(base,raise);
		System.out.println(pow);
	}
		public static int power(int base,int raise)
		{
			int power=1;
			for(int i=1;i<=raise;i++)
			{
				power=power*base;
			}
				return power;
			}
	}




